package com.rilixtech.themify_icons_typeface;

import android.content.Context;
import android.graphics.Typeface;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class ThemifyIcons implements ITypeface {
  private static final String TTF_FILE = "themify-icons-v0.1.2.ttf";
  private static final String MAPPING_FONT_PREFIX = "thei";

  private static Typeface typeface = null;

  private static HashMap<String, Character> mChars;

  @Override public IIcon getIcon(String key) {
    return Icon.valueOf(key);
  }

  @Override public HashMap<String, Character> getCharacters() {
    if (mChars == null) {
      HashMap<String, Character> aChars = new HashMap<String, Character>();
      for (Icon v : Icon.values()) {
        aChars.put(v.name(), v.character);
      }
      mChars = aChars;
    }

    return mChars;
  }

  @Override public String getMappingPrefix() {
    return MAPPING_FONT_PREFIX;
  }

  @Override public String getFontName() {
    return "Themify Icons";
  }

  @Override public String getVersion() {
    return "0.1.2";
  }

  @Override public int getIconCount() {
    return mChars.size();
  }

  @Override public Collection<String> getIcons() {
    Collection<String> icons = new LinkedList<String>();

    for (Icon value : Icon.values()) {
      icons.add(value.name());
    }

    return icons;
  }

  @Override public String getAuthor() {
    return "Lally Elias";
  }

  @Override public String getUrl() {
    return "http://themify.me/themify-icons";
  }

  @Override public String getDescription() {
    return "Themify Icons is a complete set of icons for use in web design and apps, consisting of 320+ pixel-perfect, hand-crafted icons that draw inspiration from Apple iOS 7.";
  }

  @Override public String getLicense() {
    return "SIL Open Font License (OFL)";
  }

  @Override public String getLicenseUrl() {
    return "http://scripts.sil.org/OFL";
  }

  @Override public Typeface getTypeface(Context context) {
    if (typeface == null) {
      try {
        typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + TTF_FILE);
      } catch (Exception e) {
        return null;
      }
    }
    return typeface;
  }

  public enum Icon implements IIcon {
    thei_wand('\ue600'),
    thei_volume('\ue601'),
    thei_user('\ue602'),
    thei_unlock('\ue603'),
    thei_unlink('\ue604'),
    thei_trash('\ue605'),
    thei_thought('\ue606'),
    thei_target('\ue607'),
    thei_tag('\ue608'),
    thei_tablet('\ue609'),
    thei_star('\ue60a'),
    thei_spray('\ue60b'),
    thei_signal('\ue60c'),
    thei_shopping_cart('\ue60d'),
    thei_shopping_cart_full('\ue60e'),
    thei_settings('\ue60f'),
    thei_search('\ue610'),
    thei_zoom_in('\ue611'),
    thei_zoom_out('\ue612'),
    thei_cut('\ue613'),
    thei_ruler('\ue614'),
    thei_ruler_pencil('\ue615'),
    thei_ruler_alt('\ue616'),
    thei_bookmark('\ue617'),
    thei_bookmark_alt('\ue618'),
    thei_reload('\ue619'),
    thei_plus('\ue61a'),
    thei_pin('\ue61b'),
    thei_pencil('\ue61c'),
    thei_pencil_alt('\ue61d'),
    thei_paint_roller('\ue61e'),
    thei_paint_bucket('\ue61f'),
    thei_na('\ue620'),
    thei_mobile('\ue621'),
    thei_minus('\ue622'),
    thei_medall('\ue623'),
    thei_medall_alt('\ue624'),
    thei_marker('\ue625'),
    thei_marker_alt('\ue626'),
    thei_arrow_up('\ue627'),
    thei_arrow_right('\ue628'),
    thei_arrow_left('\ue629'),
    thei_arrow_down('\ue62a'),
    thei_lock('\ue62b'),
    thei_location_arrow('\ue62c'),
    thei_link('\ue62d'),
    thei_layout('\ue62e'),
    thei_layers('\ue62f'),
    thei_layers_alt('\ue630'),
    thei_key('\ue631'),
    thei_import('\ue632'),
    thei_image('\ue633'),
    thei_heart('\ue634'),
    thei_heart_broken('\ue635'),
    thei_hand_stop('\ue636'),
    thei_hand_open('\ue637'),
    thei_hand_drag('\ue638'),
    thei_folder('\ue639'),
    thei_flag('\ue63a'),
    thei_flag_alt('\ue63b'),
    thei_flag_alt_2('\ue63c'),
    thei_eye('\ue63d'),
    thei_export('\ue63e'),
    thei_exchange_vertical('\ue63f'),
    thei_desktop('\ue640'),
    thei_cup('\ue641'),
    thei_crown('\ue642'),
    thei_comments('\ue643'),
    thei_comment('\ue644'),
    thei_comment_alt('\ue645'),
    thei_close('\ue646'),
    thei_clip('\ue647'),
    thei_angle_up('\ue648'),
    thei_angle_right('\ue649'),
    thei_angle_left('\ue64a'),
    thei_angle_down('\ue64b'),
    thei_check('\ue64c'),
    thei_check_box('\ue64d'),
    thei_camera('\ue64e'),
    thei_announcement('\ue64f'),
    thei_brush('\ue650'),
    thei_briefcase('\ue651'),
    thei_bolt('\ue652'),
    thei_bolt_alt('\ue653'),
    thei_blackboard('\ue654'),
    thei_bag('\ue655'),
    thei_move('\ue656'),
    thei_arrows_vertical('\ue657'),
    thei_arrows_horizontal('\ue658'),
    thei_fullscreen('\ue659'),
    thei_arrow_top_right('\ue65a'),
    thei_arrow_top_left('\ue65b'),
    thei_arrow_circle_up('\ue65c'),
    thei_arrow_circle_right('\ue65d'),
    thei_arrow_circle_left('\ue65e'),
    thei_arrow_circle_down('\ue65f'),
    thei_angle_double_up('\ue660'),
    thei_angle_double_right('\ue661'),
    thei_angle_double_left('\ue662'),
    thei_angle_double_down('\ue663'),
    thei_zip('\ue664'),
    thei_world('\ue665'),
    thei_wheelchair('\ue666'),
    thei_view_list('\ue667'),
    thei_view_list_alt('\ue668'),
    thei_view_grid('\ue669'),
    thei_uppercase('\ue66a'),
    thei_upload('\ue66b'),
    thei_underline('\ue66c'),
    thei_truck('\ue66d'),
    thei_timer('\ue66e'),
    thei_ticket('\ue66f'),
    thei_thumb_up('\ue670'),
    thei_thumb_down('\ue671'),
    thei_text('\ue672'),
    thei_stats_up('\ue673'),
    thei_stats_down('\ue674'),
    thei_split_v('\ue675'),
    thei_split_h('\ue676'),
    thei_smallcap('\ue677'),
    thei_shine('\ue678'),
    thei_shift_right('\ue679'),
    thei_shift_left('\ue67a'),
    thei_shield('\ue67b'),
    thei_notepad('\ue67c'),
    thei_server('\ue67d'),
    thei_quote_right('\ue67e'),
    thei_quote_left('\ue67f'),
    thei_pulse('\ue680'),
    thei_printer('\ue681'),
    thei_power_off('\ue682'),
    thei_plug('\ue683'),
    thei_pie_chart('\ue684'),
    thei_paragraph('\ue685'),
    thei_panel('\ue686'),
    thei_package('\ue687'),
    thei_music('\ue688'),
    thei_music_alt('\ue689'),
    thei_mouse('\ue68a'),
    thei_mouse_alt('\ue68b'),
    thei_money('\ue68c'),
    thei_microphone('\ue68d'),
    thei_menu('\ue68e'),
    thei_menu_alt('\ue68f'),
    thei_map('\ue690'),
    thei_map_alt('\ue691'),
    thei_loop('\ue692'),
    thei_location_pin('\ue693'),
    thei_list('\ue694'),
    thei_light_bulb('\ue695'),
    thei_Italic('\ue696'),
    thei_info('\ue697'),
    thei_infinite('\ue698'),
    thei_id_badge('\ue699'),
    thei_hummer('\ue69a'),
    thei_home('\ue69b'),
    thei_help('\ue69c'),
    thei_headphone('\ue69d'),
    thei_harddrives('\ue69e'),
    thei_harddrive('\ue69f'),
    thei_gift('\ue6a0'),
    thei_game('\ue6a1'),
    thei_filter('\ue6a2'),
    thei_files('\ue6a3'),
    thei_file('\ue6a4'),
    thei_eraser('\ue6a5'),
    thei_envelope('\ue6a6'),
    thei_download('\ue6a7'),
    thei_direction('\ue6a8'),
    thei_direction_alt('\ue6a9'),
    thei_dashboard('\ue6aa'),
    thei_control_stop('\ue6ab'),
    thei_control_shuffle('\ue6ac'),
    thei_control_play('\ue6ad'),
    thei_control_pause('\ue6ae'),
    thei_control_forward('\ue6af'),
    thei_control_backward('\ue6b0'),
    thei_cloud('\ue6b1'),
    thei_cloud_up('\ue6b2'),
    thei_cloud_down('\ue6b3'),
    thei_clipboard('\ue6b4'),
    thei_car('\ue6b5'),
    thei_calendar('\ue6b6'),
    thei_book('\ue6b7'),
    thei_bell('\ue6b8'),
    thei_basketball('\ue6b9'),
    thei_bar_chart('\ue6ba'),
    thei_bar_chart_alt('\ue6bb'),
    thei_back_right('\ue6bc'),
    thei_back_left('\ue6bd'),
    thei_arrows_corner('\ue6be'),
    thei_archive('\ue6bf'),
    thei_anchor('\ue6c0'),
    thei_align_right('\ue6c1'),
    thei_align_left('\ue6c2'),
    thei_align_justify('\ue6c3'),
    thei_align_center('\ue6c4'),
    thei_alert('\ue6c5'),
    thei_alarm_clock('\ue6c6'),
    thei_agenda('\ue6c7'),
    thei_write('\ue6c8'),
    thei_window('\ue6c9'),
    thei_widgetized('\ue6ca'),
    thei_widget('\ue6cb'),
    thei_widget_alt('\ue6cc'),
    thei_wallet('\ue6cd'),
    thei_video_clapper('\ue6ce'),
    thei_video_camera('\ue6cf'),
    thei_vector('\ue6d0'),
    thei_themify_logo('\ue6d1'),
    thei_themify_favicon('\ue6d2'),
    thei_themify_favicon_alt('\ue6d3'),
    thei_support('\ue6d4'),
    thei_stamp('\ue6d5'),
    thei_split_v_alt('\ue6d6'),
    thei_slice('\ue6d7'),
    thei_shortcode('\ue6d8'),
    thei_shift_right_alt('\ue6d9'),
    thei_shift_left_alt('\ue6da'),
    thei_ruler_alt_2('\ue6db'),
    thei_receipt('\ue6dc'),
    thei_pin2('\ue6dd'),
    thei_pin_alt('\ue6de'),
    thei_pencil_alt2('\ue6df'),
    thei_palette('\ue6e0'),
    thei_more('\ue6e1'),
    thei_more_alt('\ue6e2'),
    thei_microphone_alt('\ue6e3'),
    thei_magnet('\ue6e4'),
    thei_line_double('\ue6e5'),
    thei_line_dotted('\ue6e6'),
    thei_line_dashed('\ue6e7'),
    thei_layout_width_full('\ue6e8'),
    thei_layout_width_default('\ue6e9'),
    thei_layout_width_default_alt('\ue6ea'),
    thei_layout_tab('\ue6eb'),
    thei_layout_tab_window('\ue6ec'),
    thei_layout_tab_v('\ue6ed'),
    thei_layout_tab_min('\ue6ee'),
    thei_layout_slider('\ue6ef'),
    thei_layout_slider_alt('\ue6f0'),
    thei_layout_sidebar_right('\ue6f1'),
    thei_layout_sidebar_none('\ue6f2'),
    thei_layout_sidebar_left('\ue6f3'),
    thei_layout_placeholder('\ue6f4'),
    thei_layout_menu('\ue6f5'),
    thei_layout_menu_v('\ue6f6'),
    thei_layout_menu_separated('\ue6f7'),
    thei_layout_menu_full('\ue6f8'),
    thei_layout_media_right_alt('\ue6f9'),
    thei_layout_media_right('\ue6fa'),
    thei_layout_media_overlay('\ue6fb'),
    thei_layout_media_overlay_alt('\ue6fc'),
    thei_layout_media_overlay_alt_2('\ue6fd'),
    thei_layout_media_left_alt('\ue6fe'),
    thei_layout_media_left('\ue6ff'),
    thei_layout_media_center_alt('\ue700'),
    thei_layout_media_center('\ue701'),
    thei_layout_list_thumb('\ue702'),
    thei_layout_list_thumb_alt('\ue703'),
    thei_layout_list_post('\ue704'),
    thei_layout_list_large_image('\ue705'),
    thei_layout_line_solid('\ue706'),
    thei_layout_grid4('\ue707'),
    thei_layout_grid3('\ue708'),
    thei_layout_grid2('\ue709'),
    thei_layout_grid2_thumb('\ue70a'),
    thei_layout_cta_right('\ue70b'),
    thei_layout_cta_left('\ue70c'),
    thei_layout_cta_center('\ue70d'),
    thei_layout_cta_btn_right('\ue70e'),
    thei_layout_cta_btn_left('\ue70f'),
    thei_layout_column4('\ue710'),
    thei_layout_column3('\ue711'),
    thei_layout_column2('\ue712'),
    thei_layout_accordion_separated('\ue713'),
    thei_layout_accordion_merged('\ue714'),
    thei_layout_accordion_list('\ue715'),
    thei_ink_pen('\ue716'),
    thei_info_alt('\ue717'),
    thei_help_alt('\ue718'),
    thei_headphone_alt('\ue719'),
    thei_hand_point_up('\ue71a'),
    thei_hand_point_right('\ue71b'),
    thei_hand_point_left('\ue71c'),
    thei_hand_point_down('\ue71d'),
    thei_gallery('\ue71e'),
    thei_face_smile('\ue71f'),
    thei_face_sad('\ue720'),
    thei_credit_card('\ue721'),
    thei_control_skip_forward('\ue722'),
    thei_control_skip_backward('\ue723'),
    thei_control_record('\ue724'),
    thei_control_eject('\ue725'),
    thei_comments_smiley('\ue726'),
    thei_brush_alt('\ue727'),
    thei_youtube('\ue728'),
    thei_vimeo('\ue729'),
    thei_twitter('\ue72a'),
    thei_time('\ue72b'),
    thei_tumblr('\ue72c'),
    thei_skype('\ue72d'),
    thei_share('\ue72e'),
    thei_share_alt('\ue72f'),
    thei_rocket('\ue730'),
    thei_pinterest('\ue731'),
    thei_new_window('\ue732'),
    thei_microsoft('\ue733'),
    thei_list_ol('\ue734'),
    thei_linkedin('\ue735'),
    thei_layout_sidebar_2('\ue736'),
    thei_layout_grid4_alt('\ue737'),
    thei_layout_grid3_alt('\ue738'),
    thei_layout_grid2_alt('\ue739'),
    thei_layout_column4_alt('\ue73a'),
    thei_layout_column3_alt('\ue73b'),
    thei_layout_column2_alt('\ue73c'),
    thei_instagram('\ue73d'),
    thei_google('\ue73e'),
    thei_github('\ue73f'),
    thei_flickr('\ue740'),
    thei_facebook('\ue741'),
    thei_dropbox('\ue742'),
    thei_dribbble('\ue743'),
    thei_apple('\ue744'),
    thei_android('\ue745'),
    thei_save('\ue746'),
    thei_save_alt('\ue747'),
    thei_yahoo('\ue748'),
    thei_wordpress('\ue749'),
    thei_vimeo_alt('\ue74a'),
    thei_twitter_alt('\ue74b'),
    thei_tumblr_alt('\ue74c'),
    thei_trello('\ue74d'),
    thei_stack_overflow('\ue74e'),
    thei_soundcloud('\ue74f'),
    thei_sharethis('\ue750'),
    thei_sharethis_alt('\ue751'),
    thei_reddit('\ue752'),
    thei_pinterest_alt('\ue753'),
    thei_microsoft_alt('\ue754'),
    thei_linux('\ue755'),
    thei_jsfiddle('\ue756'),
    thei_joomla('\ue757'),
    thei_html5('\ue758'),
    thei_flickr_alt('\ue759'),
    thei_email('\ue75a'),
    thei_drupal('\ue75b'),
    thei_dropbox_alt('\ue75c'),
    thei_css3('\ue75d'),
    thei_rss('\ue75e'),
    thei_rss_alt('\ue75f');

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
        typeface = new ThemifyIcons();
      }
      return typeface;
    }
  }
}
