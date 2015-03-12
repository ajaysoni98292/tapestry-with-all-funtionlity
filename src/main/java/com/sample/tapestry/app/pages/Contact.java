package com.sample.tapestry.app.pages;

import com.sample.tapestry.app.entities.Info;
import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

/**
 *
 * @author ajay
 */

public class Contact {

    @Property
    private Info info;

    @Inject
    private Session session;

    @Inject
    private AlertManager alertManager;

    @InjectComponent
    private Zone clickZone;

    @Property
    @Persist
    private int clickCount;

    @CommitAfter
    public void onSuccess() {
        session.persist(info);
    }

    public void onActionFromIncrement() {
        clickCount++;
        alertManager.info("increment clicked");
    }

    Object onActionFromIncrementByAjay() {
        clickCount++;
        alertManager.info("ajax call");
        return clickZone;
    }
}
