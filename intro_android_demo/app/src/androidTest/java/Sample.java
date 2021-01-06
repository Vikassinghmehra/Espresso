import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import codepath.apps.demointroandroid.DemoSelector;
import codepath.apps.demointroandroid.R;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isNotChecked;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;

@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class Sample {


    //depreceated
    @Rule
    public ActivityTestRule<DemoSelector> activityActivityTestRule = new ActivityTestRule<DemoSelector>(DemoSelector.class);

    /*@Before
    public void init(){
        activityActivityTestRule.getActivity();
    }*/


    @Test
    public void fundamentalTest(){
        onView(withText("Chapter 1: App Fundamentals")).check((matches(isDisplayed())));
        onView(withText("Chapter 1: App Fundamentals")).perform(click());
        onView(withText("Basic TextView")).perform(click());
        onView(withText("Second TextView for Chapter 1")).check(matches(isDisplayed()));
        pressBack();

    }
    @Test
    public void userInterface(){
        onView(withText("Chapter 2: User Interface")).check((matches(isDisplayed())));
        onView(withText("Chapter 2: User Interface")).perform(click());
        onView(withText("Linear Layout Demo")).perform(click());
        pressBack();
    }
    @Test
    public void basicViewTest(){
        onView(withText("Chapter 3: View Controls")).check((matches(isDisplayed())));
        onView(withText("Chapter 3: View Controls")).perform(click());
        onView(withText("Basic Views")).perform(click());
        onView(withText("Hello world!")).check(matches(isDisplayed()));
        onView(withId(R.id.editText1)).perform(typeText("Hello World !!!!")).perform(clearText());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.imageView1)).perform(click());
        //onView(withId(R.id.imageButton1)).perform(click());
        pressBack();
    }
    @Test
    public void userFlows(){
        onView(withText("Chapter 5: User Flows")).perform(click());
        onView(withText("Explicit Intents")).perform(click());
        onView(withId(R.id.btnLaunchSecond)).check(matches(isDisplayed())).perform(click());
        onView(withId(R.id.tvDisplayText)).check(matches(withText(containsString("Passed String Extra!"))));
        pressBack();pressBack();
        onView(withText("Implicit Intents")).perform(click());
        onView(withId(R.id.txtUrlAddress)).perform(typeText("www.google.com"));
        onView(withId(R.id.button1)).perform(click());
    }
    @Test
    public void advancedViews(){
        onView(withText("Chapter 7: Advanced Views")).perform(click());
        onView(withText("Toast Inputs")).perform(click());
        onView(withId(R.id.etVal)).perform(typeText("Hello Vikas Testing here!!!!")).perform(clearText());
        onView(withId(R.id.etVal)).perform(typeText("Hello Vikas1111 Testing here!!!!"));
        closeSoftKeyboard();
        onView(withId(R.id.chkVal)).perform(click());
        onView(withId(R.id.rbThree)).check(matches(isNotChecked()));

        onView(withId(R.id.rbTwo)).check(matches(isNotChecked()));
        //onView(withId(R.id.rbOne)).check(matches(isNotChecked()));
        onView(withId(R.id.button1)).perform(click());
        pressBack();
        //Spinner with toast
        onView(withText("Spinner Toast")).perform(click());
        //onView(withText("Blue")).inRoot(RootMatchers.isPlatformPopup()).perform(click());
        //onView(withId(R.id.spnOptions)).perform(actionOnItemAtPosition(2, click()));
        //onChildView(withId(android.R.id.title)).check(matches(withText("General"))). perform(click())
        //onView(withId(R.id.btnSpinnerValue)).perform(click());
        //pressBack();
        //Time Picker
        //onView(withText("TimePicker")).perform(click());



    }




}




