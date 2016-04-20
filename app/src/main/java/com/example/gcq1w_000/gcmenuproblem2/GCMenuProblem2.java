package com.example.gcq1w_000.gcmenuproblem2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class GCMenuProblem2 extends AppCompatActivity {

    TextView screenLog;

    private static final int ITEM1 = Menu.FIRST;
    private static final int ITEM2 = Menu.FIRST + 1;
    private static final int ITEM3 = Menu.FIRST + 2;
    private static final int SUBMENU = Menu.FIRST + 3;
    private static final int CLEAR = Menu.FIRST + 4;
    private static final int ITEM4 = Menu.FIRST + 5;
    private static final int OPTION1 = Menu.FIRST + 6;
    private static final int OPTION2 = Menu.FIRST + 7;
    private static final int OPTION3 = Menu.FIRST + 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenLog = (TextView)findViewById(R.id.log);
    }

    // onCreateOptionsMenu - menu items
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, ITEM1, 1, "Item 1");
        menu.add(0, ITEM2, 2, "Item 2");
        menu.add(0, ITEM3, 3, "Item 3");
        SubMenu optionsMenu = menu.addSubMenu(0, SUBMENU, 4, "Submenu");
        menu.add(0, CLEAR, 5, "Clear");
        menu.add(0, ITEM4, 6, "Item 4");

        // submenu items
        optionsMenu.add(0, OPTION1, 1, "Option 1");
        optionsMenu.add(0, OPTION2, 2, "Option 2");
        optionsMenu.add(0, OPTION3, 3, "Option 3");
        return true;
    } // end onCreateOptionsMenu

    // menu item handler
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case ITEM1:
                screenLog.append("Item 1\n");
                return true;
            case ITEM2:
                screenLog.append("Item 2\n");
                return true;
            case ITEM3:
                screenLog.append("Item 3\n");
                return true;
            case SUBMENU:
                screenLog.append("Submenu\n");
                return true;
            case CLEAR:
                screenLog.setText("");
                return true;
            case ITEM4:
                screenLog.append("Item 4\n");
                return true;
            case OPTION1:
                screenLog.append("Option 1\n");
                return true;
            case OPTION2:
                screenLog.append("Option 2\n");
                return true;
            case OPTION3:
                screenLog.append("Option 3\n");
                return true;
        }
        return false;
    } // end onOptionsItemSelected

}
