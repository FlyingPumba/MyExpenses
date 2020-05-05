package org.totschnig.myexpenses;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.totschnig.myexpenses.IsEqualTrimmingAndIgnoringCase.equalToTrimmingAndIgnoringCase;
import static org.totschnig.myexpenses.VisibleViewMatcher.isVisible;

import android.os.SystemClock;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.CoordinatesProvider;
import androidx.test.espresso.action.GeneralLocation;
import androidx.test.espresso.action.GeneralSwipeAction;
import androidx.test.espresso.action.Press;
import androidx.test.espresso.action.Swipe;
import androidx.test.espresso.action.Tap;
import androidx.test.espresso.action.ViewActions;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ETGTestCaseForPR {

  @Rule
  public ActivityTestRule<org.totschnig.myexpenses.activity.SplashActivity> mActivityTestRule =
      new ActivityTestRule<>(org.totschnig.myexpenses.activity.SplashActivity.class);

  @Test
  public void myTestCase() {
    System.out.println("Starting run of ETGTestCaseForPR");
    ViewInteraction android_widget_TextView =
        onView(
            allOf(
                withId(R.id.actionbar_notifcation_textview),
                withTextOrHint(equalToTrimmingAndIgnoringCase("EN")),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.onboarding_menu),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.suw_layout_navigation_bar),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.setup_wizard_layout),
                                        isDescendantOfA(withId(R.id.viewpager))))))))));
    android_widget_TextView.perform(getClickAction());

    ViewInteraction android_widget_LinearLayout =
        onView(
            allOf(
                classOrSuperClassesName(is("android.widget.LinearLayout")),
                isVisible(),
                hasDescendant(
                    allOf(
                        withId(R.id.content),
                        hasDescendant(
                            allOf(
                                withId(R.id.title),
                                withTextOrHint(
                                    equalToTrimmingAndIgnoringCase("System default"))))))));
    android_widget_LinearLayout.perform(getClickAction());

    ViewInteraction android_widget_TextView2 =
        onView(
            allOf(
                withId(R.id.actionbar_notifcation_textview),
                withTextOrHint(equalToTrimmingAndIgnoringCase("EN")),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.onboarding_menu),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.suw_layout_navigation_bar),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.setup_wizard_layout),
                                        isDescendantOfA(withId(R.id.viewpager))))))))));
    android_widget_TextView2.perform(getClickAction());

    ViewInteraction android_widget_LinearLayout2 =
        onView(
            allOf(
                classOrSuperClassesName(is("android.widget.LinearLayout")),
                isVisible(),
                hasDescendant(
                    allOf(
                        withId(R.id.content),
                        hasDescendant(
                            allOf(
                                withId(R.id.title),
                                withTextOrHint(
                                    equalToTrimmingAndIgnoringCase("System default"))))))));
    android_widget_LinearLayout2.perform(getClickAction());

    ViewInteraction root = onView(isRoot());
    root.perform(getSwipeAction(540, 897, 540, 1794));

    waitToScrollEnd();

    ViewInteraction root2 = onView(isRoot());
    root2.perform(getSwipeAction(540, 928, 840, 928));

    waitToScrollEnd();

    ViewInteraction root3 = onView(isRoot());
    root3.perform(getSwipeAction(540, 897, 540, 0));

    waitToScrollEnd();

    ViewInteraction android_widget_Button =
        onView(
            allOf(
                withId(R.id.suw_navbar_next),
                withTextOrHint(equalToTrimmingAndIgnoringCase("NEXT")),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.suw_layout_navigation_bar),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.setup_wizard_layout),
                                isDescendantOfA(withId(R.id.viewpager))))))));
    android_widget_Button.perform(getClickAction());

    ViewInteraction root4 = onView(isRoot());
    root4.perform(getSwipeAction(540, 928, 540, 1228));

    waitToScrollEnd();

    ViewInteraction root5 = onView(isRoot());
    root5.perform(getSwipeAction(540, 928, 540, 628));

    waitToScrollEnd();

    ViewInteraction android_widget_Spinner =
        onView(
            allOf(
                withId(R.id.Currency),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.suw_layout_content),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.suw_bottom_scroll_view),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.setup_wizard_layout),
                                        isDescendantOfA(withId(R.id.viewpager))))))))));
    android_widget_Spinner.perform(getLongClickAction());

    Espresso.pressBackUnconditionally();

    ViewInteraction androidx_viewpager_widget_ViewPager =
        onView(
            allOf(
                withId(R.id.viewpager),
                isVisible(),
                hasDescendant(
                    allOf(
                        withId(R.id.setup_wizard_layout),
                        hasDescendant(
                            allOf(
                                withId(R.id.suw_bottom_scroll_view),
                                hasDescendant(
                                    allOf(
                                        withId(R.id.suw_layout_header),
                                        hasDescendant(
                                            allOf(
                                                withId(R.id.suw_layout_decor),
                                                hasDescendant(
                                                    allOf(
                                                        withId(R.id.suw_layout_title),
                                                        withTextOrHint(
                                                            equalToTrimmingAndIgnoringCase(
                                                                "Let us set up your first account"))))))))))))));
    androidx_viewpager_widget_ViewPager.perform(getClickAction());

    ViewInteraction root6 = onView(isRoot());
    root6.perform(getSwipeAction(540, 558, 840, 558));

    waitToScrollEnd();

    ViewInteraction android_widget_TextView3 =
        onView(
            allOf(
                withId(R.id.SetupMain),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.onboarding_menu),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.suw_layout_navigation_bar),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.setup_wizard_layout),
                                        isDescendantOfA(withId(R.id.viewpager))))))))));
    android_widget_TextView3.perform(getLongClickAction());

    // ViewInteraction android_widget_Button2 = onView(allOf(withId(R.id.MoreOptionsButton),
    // withTextOrHint(equalToTrimmingAndIgnoringCase("MORE OPTIONS")), isVisible(),
    // isDescendantOfA(allOf(withId(R.id.suw_layout_content),
    // isDescendantOfA(allOf(withId(R.id.suw_bottom_scroll_view),
    // isDescendantOfA(allOf(withId(R.id.setup_wizard_layout),
    // isDescendantOfA(withId(R.id.viewpager))))))))));
    // android_widget_Button2.perform(getClickAction());
    ViewInteraction android_widget_Button3 =
        onView(
            allOf(
                withId(R.id.suw_navbar_done),
                withTextOrHint(equalToTrimmingAndIgnoringCase("GET STARTED")),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.suw_layout_navigation_bar),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.setup_wizard_layout),
                                isDescendantOfA(withId(R.id.viewpager))))))));
    android_widget_Button3.perform(getClickAction());

    ViewInteraction android_widget_ImageButton =
        onView(
            allOf(
                withId(R.id.CREATE_COMMAND),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.fragment_container),
                        isDescendantOfA(withId(R.id.drawer_layout))))));
    android_widget_ImageButton.perform(getClickAction());

    ViewInteraction android_widget_Switch =
        onView(
            allOf(
                withId(R.id.TaType),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.Amount),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.AmountRow),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.Table),
                                        isDescendantOfA(withId(R.id.OneExpense))))))))));
    android_widget_Switch.perform(getClickAction());

    ViewInteraction root7 = onView(isRoot());
    root7.perform(getSwipeAction(540, 897, 540, 0));

    waitToScrollEnd();

    ViewInteraction android_widget_Spinner2 =
        onView(
            allOf(
                withId(R.id.OperationType),
                isVisible(),
                isDescendantOfA(
                    allOf(withId(R.id.toolbar), isDescendantOfA(withId(R.id.OneExpense))))));
    android_widget_Spinner2.perform(getLongClickAction());

    Espresso.pressBackUnconditionally();

    ViewInteraction android_view_ViewGroup =
        onView(
            allOf(
                withId(R.id.Amount),
                isVisible(),
                hasDescendant(withId(R.id.TaType)),
                hasDescendant(withId(R.id.AmountEditText)),
                hasDescendant(withId(R.id.Calculator)),
                isDescendantOfA(
                    allOf(
                        withId(R.id.AmountRow),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.Table), isDescendantOfA(withId(R.id.OneExpense))))))));
    android_view_ViewGroup.perform(getClickAction());

    ViewInteraction root8 = onView(isRoot());
    root8.perform(getSwipeAction(540, 897, 540, 1794));

    waitToScrollEnd();

    ViewInteraction android_widget_EditText =
        onView(
            allOf(
                withId(R.id.Payee),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.PayeeRow),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.Table), isDescendantOfA(withId(R.id.OneExpense))))))));
    android_widget_EditText.perform(replaceText("perpends"));

    ViewInteraction android_widget_Spinner3 =
        onView(
            allOf(
                withId(R.id.Account),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.AccountRow),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.Table), isDescendantOfA(withId(R.id.OneExpense))))))));
    android_widget_Spinner3.perform(getClickAction());

    Espresso.pressBackUnconditionally();

    ViewInteraction android_widget_ImageView =
        onView(
            allOf(
                withContentDescription(equalToTrimmingAndIgnoringCase("More options")),
                isVisible(),
                isDescendantOfA(
                    allOf(withId(R.id.toolbar), isDescendantOfA(withId(R.id.OneExpense))))));
    android_widget_ImageView.perform(getClickAction());

    ViewInteraction android_widget_LinearLayout3 =
        onView(
            allOf(
                classOrSuperClassesName(is("android.widget.LinearLayout")),
                isVisible(),
                hasDescendant(
                    allOf(
                        withId(R.id.content),
                        hasDescendant(
                            allOf(
                                withId(R.id.title),
                                withTextOrHint(equalToTrimmingAndIgnoringCase("Help"))))))));
    android_widget_LinearLayout3.perform(getClickAction());

    ViewInteraction root9 = onView(isRoot());
    root9.perform(getSwipeAction(540, 897, 540, 1794));

    waitToScrollEnd();

    ViewInteraction android_widget_TextView4 =
        onView(
            allOf(
                withId(R.id.screen_info),
                withTextOrHint(
                    equalToTrimmingAndIgnoringCase(
                        "Use this form to enter a new transaction or to edit an existing one. Use the dropdown menu in the actionbar to switch to the form for adding a new transfer or split transaction.")),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.help),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.aboutscrollview),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.custom),
                                        isDescendantOfA(
                                            allOf(
                                                withId(R.id.customPanel),
                                                isDescendantOfA(withId(R.id.parentPanel))))))))))));
    android_widget_TextView4.perform(getClickAction());

    ViewInteraction android_widget_TextView5 =
        onView(
            allOf(
                withId(R.id.screen_info),
                withTextOrHint(
                    equalToTrimmingAndIgnoringCase(
                        "Use this form to enter a new transaction or to edit an existing one. Use the dropdown menu in the actionbar to switch to the form for adding a new transfer or split transaction.")),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.help),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.aboutscrollview),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.custom),
                                        isDescendantOfA(
                                            allOf(
                                                withId(R.id.customPanel),
                                                isDescendantOfA(withId(R.id.parentPanel))))))))))));
    android_widget_TextView5.perform(getLongClickAction());

    ViewInteraction root10 = onView(isRoot());
    root10.perform(getSwipeAction(540, 897, 540, 0));

    waitToScrollEnd();

    Espresso.pressBackUnconditionally();

    ViewInteraction android_widget_ImageView2 =
        onView(
            allOf(
                withId(R.id.Calculator),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.Amount),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.AmountRow),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.Table),
                                        isDescendantOfA(withId(R.id.OneExpense))))))))));
    android_widget_ImageView2.perform(getClickAction());

    ViewInteraction android_widget_Button4 =
        onView(
            allOf(
                withId(R.id.bDot),
                withTextOrHint(equalToTrimmingAndIgnoringCase(".")),
                isVisible()));
    android_widget_Button4.perform(getClickAction());

    ViewInteraction android_widget_Button5 =
        onView(
            allOf(
                withId(R.id.b3), withTextOrHint(equalToTrimmingAndIgnoringCase("3")), isVisible()));
    android_widget_Button5.perform(getClickAction());

    ViewInteraction android_widget_Button6 =
        onView(
            allOf(
                withId(R.id.b3), withTextOrHint(equalToTrimmingAndIgnoringCase("3")), isVisible()));
    android_widget_Button6.perform(getClickAction());

    ViewInteraction android_widget_Button7 =
        onView(
            allOf(
                withId(R.id.bDelete),
                withTextOrHint(equalToTrimmingAndIgnoringCase("<")),
                isVisible()));
    android_widget_Button7.perform(getClickAction());

    ViewInteraction android_widget_Button8 =
        onView(
            allOf(
                withId(R.id.bPercent),
                withTextOrHint(equalToTrimmingAndIgnoringCase("%")),
                isVisible()));
    android_widget_Button8.perform(getClickAction());

    ViewInteraction android_widget_Button9 =
        onView(
            allOf(
                withId(R.id.bCancel),
                withTextOrHint(equalToTrimmingAndIgnoringCase("CANCEL")),
                isVisible()));
    android_widget_Button9.perform(getClickAction());

    // ViewInteraction android_widget_Button10 = onView(allOf(withId(R.id.TimeButton),
    // withTextOrHint(equalToTrimmingAndIgnoringCase("2:59 PM")), isVisible(),
    // isDescendantOfA(allOf(withId(R.id.DateTimeRow), isDescendantOfA(allOf(withId(R.id.Table),
    // isDescendantOfA(withId(R.id.OneExpense))))))));
    // android_widget_Button10.perform(getClickAction());
    Espresso.pressBackUnconditionally();

    // ViewInteraction android_view_ViewGroup2 = onView(allOf(withId(R.id.Amount), isVisible(),
    // hasDescendant(withId(R.id.TaType)), hasDescendant(withId(R.id.AmountEditText)),
    // hasDescendant(withId(R.id.Calculator)), isDescendantOfA(allOf(withId(R.id.AmountRow),
    // isDescendantOfA(allOf(withId(R.id.Table), isDescendantOfA(withId(R.id.OneExpense))))))));
    // android_view_ViewGroup2.perform(getClickAction());
    onView(isRoot()).perform(pressKey(KeyEvent.KEYCODE_ENTER));

    Espresso.pressBackUnconditionally();

    ViewInteraction android_widget_Switch2 =
        onView(
            allOf(
                withId(R.id.TaType),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.Amount),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.AmountRow),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.Table),
                                        isDescendantOfA(withId(R.id.OneExpense))))))))));
    android_widget_Switch2.perform(getClickAction());

    ViewInteraction android_widget_ImageView3 =
        onView(
            allOf(
                withId(R.id.AttachImage),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.CommentRow),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.Table), isDescendantOfA(withId(R.id.OneExpense))))))));
    android_widget_ImageView3.perform(getClickAction());

    ViewInteraction android_widget_RadioButton =
        onView(
            allOf(
                withId(R.id.package_button),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.contrib_feature_container),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.feature_list),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.aboutscrollview),
                                        isDescendantOfA(
                                            allOf(
                                                withId(R.id.custom),
                                                isDescendantOfA(
                                                    allOf(
                                                        withId(R.id.customPanel),
                                                        isDescendantOfA(
                                                            withId(R.id.parentPanel))))))))))))));
    android_widget_RadioButton.perform(getClickAction());

    ViewInteraction android_widget_RadioButton2 =
        onView(
            allOf(
                withId(R.id.package_button),
                isVisible(),
                isDescendantOfA(
                    allOf(
                        withId(R.id.contrib_feature_container),
                        isDescendantOfA(
                            allOf(
                                withId(R.id.feature_list),
                                isDescendantOfA(
                                    allOf(
                                        withId(R.id.aboutscrollview),
                                        isDescendantOfA(
                                            allOf(
                                                withId(R.id.custom),
                                                isDescendantOfA(
                                                    allOf(
                                                        withId(R.id.customPanel),
                                                        isDescendantOfA(
                                                            withId(R.id.parentPanel))))))))))))));
    android_widget_RadioButton2.perform(getClickAction());
  }

  private static Matcher<View> classOrSuperClassesName(final Matcher<String> classNameMatcher) {

    return new TypeSafeMatcher<View>() {
      @Override
      public void describeTo(Description description) {
        description.appendText("Class name or any super class name ");
        classNameMatcher.describeTo(description);
      }

      @Override
      public boolean matchesSafely(View view) {
        Class<?> clazz = view.getClass();
        String canonicalName;

        do {
          canonicalName = clazz.getCanonicalName();
          if (canonicalName == null) {
            return false;
          }

          if (classNameMatcher.matches(canonicalName)) {
            return true;
          }

          clazz = clazz.getSuperclass();
          if (clazz == null) {
            return false;
          }
        } while (!"java.lang.Object".equals(canonicalName));

        return false;
      }
    };
  }

  private static Matcher<View> withTextOrHint(final Matcher<String> stringMatcher) {
    return anyOf(withText(stringMatcher), withHint(stringMatcher));
  }

  private ViewAction getSwipeAction(
      final int fromX, final int fromY, final int toX, final int toY) {
    return ViewActions.actionWithAssertions(
        new GeneralSwipeAction(
            Swipe.SLOW,
            new CoordinatesProvider() {
              @Override
              public float[] calculateCoordinates(View view) {
                float[] coordinates = {fromX, fromY};
                return coordinates;
              }
            },
            new CoordinatesProvider() {
              @Override
              public float[] calculateCoordinates(View view) {
                float[] coordinates = {toX, toY};
                return coordinates;
              }
            },
            Press.FINGER));
  }

  private void waitToScrollEnd() {
    SystemClock.sleep(500);
  }

  private ClickWithoutDisplayConstraint getClickAction() {
    return new ClickWithoutDisplayConstraint(
        Tap.SINGLE,
        GeneralLocation.VISIBLE_CENTER,
        Press.FINGER,
        InputDevice.SOURCE_UNKNOWN,
        MotionEvent.BUTTON_PRIMARY);
  }

  private ClickWithoutDisplayConstraint getLongClickAction() {
    return new ClickWithoutDisplayConstraint(
        Tap.LONG,
        GeneralLocation.CENTER,
        Press.FINGER,
        InputDevice.SOURCE_UNKNOWN,
        MotionEvent.BUTTON_PRIMARY);
  }
}
