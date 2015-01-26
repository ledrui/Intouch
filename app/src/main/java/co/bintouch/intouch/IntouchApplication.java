package co.bintouch.intouch;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseUser;
import com.parse.ParseException;
import com.parse.SignUpCallback;


import android.app.Application;

/**
 * Created by Zack on 1/25/2015.
 */
public class IntouchApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "a7m5pD8YpJSXJ2dTVci1I9WOVbS3PyFj2TRQawJ7",
                "rHObGgrLrUe0qKWJp4l05JFBc8Owta6dxMoeXKDY");

       /* ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();*/
    }

}
