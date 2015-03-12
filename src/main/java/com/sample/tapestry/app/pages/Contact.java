package com.sample.tapestry.app.pages;

import com.sample.tapestry.app.entities.Info;
import org.apache.tapestry5.annotations.Property;
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

    @CommitAfter
    public void onSuccess() {
        session.persist(info);
    }
}
