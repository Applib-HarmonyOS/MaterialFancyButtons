package com.rilixtech.open_iconic_typeface;

import android.content.Context;
import android.graphics.Typeface;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class OpenIconic implements ITypeface {
    private static final String TTF_FILE = "open-iconic-1.1.1.ttf";
    private static final String MAPPING_FONT_PREFIX = "opic";

    private static Typeface typeface = null;

    private static HashMap<String, Character> mChars;

    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<>();
            for (Icon v : Icon.values()) {
                aChars.put(v.name(),
                        v.character);
            }
            mChars = aChars;
        }

        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return MAPPING_FONT_PREFIX;
    }

    @Override
    public String getFontName() {
        return "Open Iconic";
    }

    @Override
    public String getVersion() {
        return "1.1.1";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> icons = new LinkedList<String>();

        for (Icon value : Icon.values()) {
            icons.add(value.name());
        }

        return icons;
    }

    @Override
    public String getAuthor() {
        return "Iconic";
    }

    @Override
    public String getUrl() {
        return "https://github.com/iconic/open-iconic/";
    }

    @Override
    public String getDescription() {
        return "GitHub's icon font http://useiconic.com/";
    }

    @Override
    public String getLicense() {
        return " SIL OFL 1.1";
    }

    @Override
    public String getLicenseUrl() {
        return "http://scripts.sil.org/OFL";
    }

    @Override
    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(),
                        "fonts/" + TTF_FILE);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public enum Icon implements IIcon {
        //Open Iconic
        opic_account_login('\ue000'),
        opic_account_logout('\ue001'),
        opic_action_redo('\ue002'),
        opic_action_undo('\ue003'),
        opic_align_center('\ue004'),
        opic_align_left('\ue005'),
        opic_align_right('\ue006'),
        opic_aperture('\ue007'),
        opic_arrow_bottom('\ue008'),
        opic_arrow_circle_bottom('\ue009'),
        opic_arrow_circle_left('\ue00a'),
        opic_arrow_circle_right('\ue00b'),
        opic_arrow_circle_top('\ue00c'),
        opic_arrow_left('\ue00d'),
        opic_arrow_right('\ue00e'),
        opic_arrow_thick_bottom('\ue00f'),
        opic_arrow_thick_left('\ue010'),
        opic_arrow_thick_right('\ue011'),
        opic_arrow_thick_top('\ue012'),
        opic_arrow_top('\ue013'),
        opic_audio_spectrum('\ue014'),
        opic_audio('\ue015'),
        opic_badge('\ue016'),
        opic_ban('\ue017'),
        opic_bar_chart('\ue018'),
        opic_basket('\ue019'),
        opic_battery_empty('\ue01a'),
        opic_battery_full('\ue01b'),
        opic_beaker('\ue01c'),
        opic_bell('\ue01d'),
        opic_bluetooth('\ue01e'),
        opic_bold('\ue01f'),
        opic_bolt('\ue020'),
        opic_book('\ue021'),
        opic_bookmark('\ue022'),
        opic_box('\ue023'),
        opic_briefcase('\ue024'),
        opic_british_pound('\ue025'),
        opic_browser('\ue026'),
        opic_brush('\ue027'),
        opic_bug('\ue028'),
        opic_bullhorn('\ue029'),
        opic_calculator('\ue02a'),
        opic_calendar('\ue02b'),
        opic_camera_slr('\ue02c'),
        opic_caret_bottom('\ue02d'),
        opic_caret_left('\ue02e'),
        opic_caret_right('\ue02f'),
        opic_caret_top('\ue030'),
        opic_cart('\ue031'),
        opic_chat('\ue032'),
        opic_check('\ue033'),
        opic_chevron_bottom('\ue034'),
        opic_chevron_left('\ue035'),
        opic_chevron_right('\ue036'),
        opic_chevron_top('\ue037'),
        opic_circle_check('\ue038'),
        opic_circle_x('\ue039'),
        opic_clipboard('\ue03a'),
        opic_clock('\ue03b'),
        opic_cloud_download('\ue03c'),
        opic_cloud_upload('\ue03d'),
        opic_cloud('\ue03e'),
        opic_cloudy('\ue03f'),
        opic_code('\ue040'),
        opic_cog('\ue041'),
        opic_collapse_down('\ue042'),
        opic_collapse_left('\ue043'),
        opic_collapse_right('\ue044'),
        opic_collapse_up('\ue045'),
        opic_command('\ue046'),
        opic_comment_square('\ue047'),
        opic_compass('\ue048'),
        opic_contrast('\ue049'),
        opic_copywriting('\ue04a'),
        opic_credit_card('\ue04b'),
        opic_crop('\ue04c'),
        opic_dashboard('\ue04d'),
        opic_data_transfer_download('\ue04e'),
        opic_data_transfer_upload('\ue04f'),
        opic_delete('\ue050'),
        opic_dial('\ue051'),
        opic_document('\ue052'),
        opic_dollar('\ue053'),
        opic_double_quote_sans_left('\ue054'),
        opic_double_quote_sans_right('\ue055'),
        opic_double_quote_serif_left('\ue056'),
        opic_double_quote_serif_right('\ue057'),
        opic_droplet('\ue058'),
        opic_eject('\ue059'),
        opic_elevator('\ue05a'),
        opic_ellipses('\ue05b'),
        opic_envelope_closed('\ue05c'),
        opic_envelope_open('\ue05d'),
        opic_euro('\ue05e'),
        opic_excerpt('\ue05f'),
        opic_expand_down('\ue060'),
        opic_expand_left('\ue061'),
        opic_expand_right('\ue062'),
        opic_expand_up('\ue063'),
        opic_external_link('\ue064'),
        opic_eye('\ue065'),
        opic_eyedropper('\ue066'),
        opic_file('\ue067'),
        opic_fire('\ue068'),
        opic_flag('\ue069'),
        opic_flash('\ue06a'),
        opic_folder('\ue06b'),
        opic_fork('\ue06c'),
        opic_fullscreen_enter('\ue06d'),
        opic_fullscreen_exit('\ue06e'),
        opic_globe('\ue06f'),
        opic_graph('\ue070'),
        opic_grid_four_up('\ue071'),
        opic_grid_three_up('\ue072'),
        opic_grid_two_up('\ue073'),
        opic_hard_drive('\ue074'),
        opic_header('\ue075'),
        opic_headphones('\ue076'),
        opic_heart('\ue077'),
        opic_home('\ue078'),
        opic_image('\ue079'),
        opic_inbox('\ue07a'),
        opic_infinity('\ue07b'),
        opic_info('\ue07c'),
        opic_italic('\ue07d'),
        opic_justify_center('\ue07e'),
        opic_justify_left('\ue07f'),
        opic_justify_right('\ue080'),
        opic_key('\ue081'),
        opic_laptop('\ue082'),
        opic_layers('\ue083'),
        opic_lightbulb('\ue084'),
        opic_link_broken('\ue085'),
        opic_link_intact('\ue086'),
        opic_list_rich('\ue087'),
        opic_list('\ue088'),
        opic_location('\ue089'),
        opic_lock_locked('\ue08a'),
        opic_lock_unlocked('\ue08b'),
        opic_loop_circular('\ue08c'),
        opic_loop_square('\ue08d'),
        opic_loop('\ue08e'),
        opic_magnifying_glass('\ue08f'),
        opic_map_marker('\ue090'),
        opic_map('\ue091'),
        opic_media_pause('\ue092'),
        opic_media_play('\ue093'),
        opic_media_record('\ue094'),
        opic_media_skip_backward('\ue095'),
        opic_media_skip_forward('\ue096'),
        opic_media_step_backward('\ue097'),
        opic_media_step_forward('\ue098'),
        opic_media_stop('\ue099'),
        opic_medical_cross('\ue09a'),
        opic_menu('\ue09b'),
        opic_microphone('\ue09c'),
        opic_minus('\ue09d'),
        opic_monitor('\ue09e'),
        opic_moon('\ue09f'),
        opic_move('\ue0a0'),
        opic_musical_note('\ue0a1'),
        opic_paperclip('\ue0a2'),
        opic_pencil('\ue0a3'),
        opic_people('\ue0a4'),
        opic_person('\ue0a5'),
        opic_phone('\ue0a6'),
        opic_pie_chart('\ue0a7'),
        opic_pin('\ue0a8'),
        opic_play_circle('\ue0a9'),
        opic_plus('\ue0aa'),
        opic_power_standby('\ue0ab'),
        opic_print('\ue0ac'),
        opic_project('\ue0ad'),
        opic_pulse('\ue0ae'),
        opic_puzzle_piece('\ue0af'),
        opic_question_mark('\ue0b0'),
        opic_rain('\ue0b1'),
        opic_random('\ue0b2'),
        opic_reload('\ue0b3'),
        opic_resize_both('\ue0b4'),
        opic_resize_height('\ue0b5'),
        opic_resize_width('\ue0b6'),
        opic_rss_alt('\ue0b7'),
        opic_rss('\ue0b8'),
        opic_script('\ue0b9'),
        opic_share_boxed('\ue0ba'),
        opic_share('\ue0bb'),
        opic_shield('\ue0bc'),
        opic_signal('\ue0bd'),
        opic_signpost('\ue0be'),
        opic_sort_ascending('\ue0bf'),
        opic_sort_descending('\ue0c0'),
        opic_spreadsheet('\ue0c1'),
        opic_star('\ue0c2'),
        opic_sun('\ue0c3'),
        opic_tablet('\ue0c4'),
        opic_tag('\ue0c5'),
        opic_tags('\ue0c6'),
        opic_target('\ue0c7'),
        opic_task('\ue0c8'),
        opic_terminal('\ue0c9'),
        opic_text('\ue0ca'),
        opic_thumb_down('\ue0cb'),
        opic_thumb_up('\ue0cc'),
        opic_timer('\ue0cd'),
        opic_transfer('\ue0ce'),
        opic_trash('\ue0cf'),
        opic_underline('\ue0d0'),
        opic_vertical_align_bottom('\ue0d1'),
        opic_vertical_align_center('\ue0d2'),
        opic_vertical_align_top('\ue0d3'),
        opic_video('\ue0d4'),
        opic_volume_high('\ue0d5'),
        opic_volume_low('\ue0d6'),
        opic_volume_off('\ue0d7'),
        opic_warning('\ue0d8'),
        opic_wifi('\ue0d9'),
        opic_wrench('\ue0da'),
        opic_x('\ue0db'),
        opic_yen('\ue0dc'),
        opic_zoom_in('\ue0dd'),
        opic_zoom_out('\ue0de');

        char character;

        Icon(char character) {
            this.character = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return character;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typeface;

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new OpenIconic();
            }
            return typeface;
        }
    }
}
