/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2017, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.]
 *
 */

package org.jfree.chart.ui;

import org.jfree.chart.util.ResourceBundleWrapper;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

/**
 * A field for displaying a font selection.  The display field itself is
 * read-only, to the developer must provide another mechanism to allow the
 * user to change the font.
 */
public class FontDisplayField extends JTextField {

    /**
     * The resourceBundle for the localization.
     */
    protected static final ResourceBundle localizationResources =
            ResourceBundleWrapper.getBundle("org.jfree.chart.ui.LocalizationBundle");
    /**
     * The current font.
     */
    private Font displayFont;

    /**
     * Standard constructor - builds a FontDescriptionField initialised with
     * the specified font.
     *
     * @param font the font.
     */
    public FontDisplayField(Font font) {
        super("");
        setDisplayFont(font);
        setEnabled(false);
    }

    /**
     * Returns the current font.
     *
     * @return the font.
     */
    public Font getDisplayFont() {
        return this.displayFont;
    }

    /**
     * Sets the font.
     *
     * @param font the font.
     */
    public void setDisplayFont(Font font) {
        this.displayFont = font;
        setText(fontToString(this.displayFont));
    }

    /**
     * Returns a string representation of the specified font.
     *
     * @param font the font.
     * @return a string describing the font.
     */
    private String fontToString(Font font) {
        if (font != null) {
            return font.getFontName() + ", " + font.getSize();
        } else {
            return localizationResources.getString("No_Font_Selected");
        }
    }

}

