/*
 * Copyright 2014 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rilixtech.devicontypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Devicon font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Devicon implements MfbTypeface {
    private static final String TTF_FILE = "devicon-font-v2.0.0.1.ttf";
    private static final String DEVICON_PREFIX = "DEVI";
    public static final String DEVICON_NAME = "DevIcon";
    public static final String DEVICON_VERSION = "2" + ".0.0.1";
    public static final String DEVICON_AUTHOR = "Konpa";
    public static final String DEVICON_URL = "http://devicon.fr/";
    public static final String DEVICON_DESC = "Devicon is a set of icons representing programming languages, designing"
            + " & development tools. You can use it as a font or directly copy/paste the svg code into your project.";
    public static final String DEVICON_LICENSE = "MIT License";
    public static final String DEVICON_LICENSE_URL = "https://github.com/konpa/devicon/blob/master/LICENSE";
    private static Font deviconTypeface = null;
    private static HashMap<String, Character> deviconCharMap;

    /**
     * Devicon MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Devicon MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Devicon icon characters in a HashMap.
     *
     * @return HashMap of all Devicon icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (deviconCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.deviconCharacter);
            }
            setChars(characterHashMap);
        }
        return deviconCharMap;
    }

    /**
     * Set the Devicon Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        deviconCharMap = characterHashMap;
    }

    /**
     * Return the Devicon Mapping Prefix.
     *
     * @return Devicon Mapping Prefix, used by all Devicon icons.
     */
    @Override
    public String getMappingPrefix() {
        return DEVICON_PREFIX;
    }

    @Override
    public String getFontName() {
        return DEVICON_NAME;
    }

    @Override
    public String getVersion() {
        return DEVICON_VERSION;
    }

    @Override
    public int getIconCount() {
        return deviconCharMap.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> deviconKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            deviconKeyList.add(value.name());
        }
        return deviconKeyList;
    }

    @Override
    public String getAuthor() {
        return DEVICON_AUTHOR;
    }

    @Override
    public String getUrl() {
        return DEVICON_URL;
    }

    @Override
    public String getDescription() {
        return DEVICON_DESC;
    }

    @Override
    public String getLicense() {
        return DEVICON_LICENSE;
    }

    @Override
    public String getLicenseUrl() {
        return DEVICON_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (deviconTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return deviconTypeface;
    }

    private static void cacheTypeface(Font font) {
        deviconTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Devicon typeface.
     */
    public enum Icon implements MfbIcon {
        DEVI_SSH_PLAIN_WORDMARK((char) 0xe900),
        DEVI_SSH_PLAIN((char) 0xe901),
        DEVI_SOURCETREE_PLAIN_WORDMARK((char) 0xe902),
        DEVI_SOURCETREE_PLAIN((char) 0xe903),
        DEVI_PHPSTORM_PLAIN_WORDMARK((char) 0xe904),
        DEVI_PHPSTORM_PLAIN((char) 0xe905),
        DEVI_JEET_PLAIN_WORDMARK((char) 0xe906),
        DEVI_JEET_PLAIN((char) 0xe907),
        DEVI_GITLAB_PLAIN_WORDMARK((char) 0xe908),
        DEVI_GITLAB_PLAIN((char) 0xe909),
        DEVI_GITHUB_PLAIN_WORDMARK((char) 0xe90a),
        DEVI_GITHUB_PLAIN((char) 0xe90b),
        DEVI_D3JS_PLAIN((char) 0xe90c),
        DEVI_CONFLUENCE_PLAIN_WORDMARK((char) 0xe90d),
        DEVI_CONFLUENCE_PLAIN((char) 0xe90e),
        DEVI_BITBUCKET_PLAIN_WORDMARK((char) 0xe90f),
        DEVI_BITBUCKET_PLAIN((char) 0xe910),
        DEVI_SAFARI_LINE_WORDMARK((char) 0xe632),
        DEVI_SAFARI_LINE((char) 0xe63a),
        DEVI_SAFARI_PLAIN_WORDMARK((char) 0xe63b),
        DEVI_SAFARI_PLAIN((char) 0xe63c),
        DEVI_JETBRAINS_PLAIN_WORDMARK((char) 0xe63d),
        DEVI_DJANGO_LINE_WORDMARK((char) 0xe63e),
        DEVI_DJANGO_PLAIN_WORDMARK((char) 0xe63f),
        DEVI_GIMP_PLAIN((char) 0xe633),
        DEVI_REDHAT_PLAIN_WORDMARK((char) 0xe62a),
        DEVI_REDHAT_PLAIN((char) 0xe62b),
        DEVI_CPLUSPLUS_LINE_WORDMARK((char) 0xe634),
        DEVI_CPLUSPLUS_PLAIN_WORDMARK((char) 0xe635),
        DEVI_CSHARP_LINE_WORDMARK((char) 0xe636),
        DEVI_CSHARP_PLAIN_WORDMARK((char) 0xe637),
        DEVI_C_LINE_WORDMARK((char) 0xe638),
        DEVI_C_PLAIN_WORDMARK((char) 0xe639),
        DEVI_NODEWEBKIT_LINE_WORDMARK((char) 0xe611),
        DEVI_NODEWEBKIT_LINE((char) 0xe612),
        DEVI_NODEWEBKIT_PLAIN_WORDMARK((char) 0xe613),
        DEVI_NODEWEBKIT_PLAIN((char) 0xe614),
        DEVI_NGINX_PLAIN_WORDMARK((char) 0xe615),
        DEVI_ERLANG_PLAIN_WORDMARK((char) 0xe616),
        DEVI_ERLANG_PLAIN((char) 0xe617),
        DEVI_DOCTRINE_LINE_WORDMARK((char) 0xe618),
        DEVI_DOCTRINE_LINE((char) 0xe619),
        DEVI_DOCTRINE_PLAIN_WORDMARK((char) 0xe61a),
        DEVI_DOCTRINE_PLAIN((char) 0xe625),
        DEVI_APACHE_LINE_WORDMARK((char) 0xe626),
        DEVI_APACHE_LINE((char) 0xe627),
        DEVI_APACHE_PLAIN_WORDMARK((char) 0xe628),
        DEVI_APACHE_PLAIN((char) 0xe629),
        DEVI_GO_LINE((char) 0xe610),
        DEVI_REDIS_PLAIN_WORDMARK((char) 0xe606),
        DEVI_REDIS_PLAIN((char) 0xe607),
        DEVI_METEOR_PLAIN_WORDMARK((char) 0xe608),
        DEVI_METEOR_PLAIN((char) 0xe609),
        DEVI_HEROKU_ORIGINAL_WORDMARK((char) 0xe60a),
        DEVI_HEROKU_ORIGINAL((char) 0xe60b),
        DEVI_HEROKU_PLAIN_WORDMARK((char) 0xe60c),
        DEVI_HEROKU_PLAIN((char) 0xe60f),
        DEVI_GO_PLAIN((char) 0xe61b),
        DEVI_DOCKER_PLAIN_WORDMARK((char) 0xe61e),
        DEVI_DOCKER_PLAIN((char) 0xe61f),
        DEVI_AMAZONWEBSERVICES_PLAIN((char) 0xe603),
        DEVI_AMAZONWEBSERVICES_PLAIN_WORDMARK((char) 0xe604),
        DEVI_ANGULARJS_PLAIN_WORDMARK((char) 0xe61c),
        DEVI_ANGULARJS_PLAIN((char) 0xe61d),
        DEVI_APPCELERATOR_PLAIN((char) 0xe620),
        DEVI_APPCELERATOR_PLAIN_WORDMARK((char) 0xe621),
        DEVI_APPLE_PLAIN((char) 0xe622),
        DEVI_ATOM_PLAIN_WORDMARK((char) 0xe623),
        DEVI_ATOM_PLAIN((char) 0xe624),
        DEVI_BACKBONEJS_PLAIN_WORDMARK((char) 0xe62c),
        DEVI_BACKBONEJS_PLAIN((char) 0xe62d),
        DEVI_BOOTSTRAP_PLAIN_WORDMARK((char) 0xe62e),
        DEVI_BOOTSTRAP_PLAIN((char) 0xe62f),
        DEVI_BOWER_LINE_WORDMARK((char) 0xe630),
        DEVI_BOWER_LINE((char) 0xe631),
        DEVI_BOWER_PLAIN_WORDMARK((char) 0xe64e),
        DEVI_BOWER_PLAIN((char) 0xe64f),
        DEVI_CHROME_PLAIN_WORDMARK((char) 0xe665),
        DEVI_CHROME_PLAIN((char) 0xe666),
        DEVI_CODEIGNITER_PLAIN_WORDMARK((char) 0xe667),
        DEVI_CODEIGNITER_PLAIN((char) 0xe668),
        DEVI_COFFEESCRIPT_PLAIN_WORDMARK((char) 0xe669),
        DEVI_COFFEESCRIPT_PLAIN((char) 0xe66a),
        DEVI_CSS3_PLAIN_WORDMARK((char) 0xe678),
        DEVI_CSS3_PLAIN((char) 0xe679),
        DEVI_DEBIAN_PLAIN_WORDMARK((char) 0xe67e),
        DEVI_DEBIAN_PLAIN((char) 0xe67f),
        DEVI_DOT_NET_PLAIN_WORDMARK((char) 0xe6d3),
        DEVI_DOT_NET_PLAIN((char) 0xe6d4),
        DEVI_DRUPAL_PLAIN_WORDMARK((char) 0xe6e2),
        DEVI_DRUPAL_PLAIN((char) 0xe6e3),
        DEVI_FIREFOX_PLAIN_WORDMARK((char) 0xe75d),
        DEVI_FIREFOX_PLAIN((char) 0xe75e),
        DEVI_FOUNDATION_PLAIN_WORDMARK((char) 0xe7a2),
        DEVI_FOUNDATION_PLAIN((char) 0xe7a3),
        DEVI_GIT_PLAIN_WORDMARK((char) 0xe7a7),
        DEVI_GIT_PLAIN((char) 0xe7a8),
        DEVI_GRUNT_LINE_WORDMARK((char) 0xe7a9),
        DEVI_GRUNT_LINE((char) 0xe7aa),
        DEVI_GRUNT_PLAIN_WORDMARK((char) 0xe7ea),
        DEVI_GRUNT_PLAIN((char) 0xe7eb),
        DEVI_GULP_PLAIN((char) 0xe7ec),
        DEVI_HTML5_PLAIN_WORDMARK((char) 0xe7f6),
        DEVI_HTML5_PLAIN((char) 0xe7f7),
        DEVI_IE10_PLAIN((char) 0xe7f8),
        DEVI_ILLUSTRATOR_LINE((char) 0xe7f9),
        DEVI_ILLUSTRATOR_PLAIN((char) 0xe7fa),
        DEVI_INKSCAPE_PLAIN_WORDMARK((char) 0xe834),
        DEVI_INKSCAPE_PLAIN((char) 0xe835),
        DEVI_JAVA_PLAIN_WORDMARK((char) 0xe841),
        DEVI_JAVA_PLAIN((char) 0xe842),
        DEVI_JAVASCRIPT_PLAIN((char) 0xe845),
        DEVI_JQUERY_PLAIN_WORDMARK((char) 0xe849),
        DEVI_JQUERY_PLAIN((char) 0xe84a),
        DEVI_KRAKENJS_PLAIN_WORDMARK((char) 0xe84f),
        DEVI_KRAKENJS_PLAIN((char) 0xe850),
        DEVI_LARAVEL_PLAIN_WORDMARK((char) 0xe851),
        DEVI_LARAVEL_PLAIN((char) 0xe852),
        DEVI_LESS_PLAIN_WORDMARK((char) 0xe853),
        DEVI_LINUX_PLAIN((char) 0xeb1c),
        DEVI_MONGODB_PLAIN_WORDMARK((char) 0xeb43),
        DEVI_MONGODB_PLAIN((char) 0xeb44),
        DEVI_MOODLE_PLAIN_WORDMARK((char) 0xeb5a),
        DEVI_MOODLE_PLAIN((char) 0xeb5b),
        DEVI_MYSQL_PLAIN_WORDMARK((char) 0xeb60),
        DEVI_MYSQL_PLAIN((char) 0xeb61),
        DEVI_NODEJS_PLAIN_WORDMARK((char) 0xeb69),
        DEVI_NODEJS_PLAIN((char) 0xeb6a),
        DEVI_ORACLE_PLAIN((char) 0xeb6b),
        DEVI_PHOTOSHOP_LINE((char) 0xeb6c),
        DEVI_PHOTOSHOP_PLAIN((char) 0xeb6d),
        DEVI_PHP_PLAIN((char) 0xeb71),
        DEVI_POSTGRESQL_PLAIN_WORDMARK((char) 0xeb7c),
        DEVI_POSTGRESQL_PLAIN((char) 0xeb7d),
        DEVI_PYTHON_PLAIN_WORDMARK((char) 0xeb88),
        DEVI_PYTHON_PLAIN((char) 0xeb89),
        DEVI_RAILS_PLAIN_WORDMARK((char) 0xeba2),
        DEVI_RAILS_PLAIN((char) 0xeba3),
        DEVI_REACT_PLAIN_WORDMARK((char) 0xe600),
        DEVI_REACT_PLAIN((char) 0xe601),
        DEVI_RUBY_PLAIN_WORDMARK((char) 0xebc9),
        DEVI_RUBY_PLAIN((char) 0xebca),
        DEVI_SASS_PLAIN((char) 0xebcb),
        DEVI_SYMFONY_PLAIN_WORDMARK((char) 0xe602),
        DEVI_SYMFONY_PLAIN((char) 0xe605),
        DEVI_TRAVIS_PLAIN_WORDMARK((char) 0xebcc),
        DEVI_TRAVIS_PLAIN((char) 0xebcd),
        DEVI_TRELLO_PLAIN_WORDMARK((char) 0xebce),
        DEVI_TRELLO_PLAIN((char) 0xebcf),
        DEVI_UBUNTU_PLAIN_WORDMARK((char) 0xebd0),
        DEVI_UBUNTU_PLAIN((char) 0xebd1),
        DEVI_VIM_PLAIN((char) 0xebf3),
        DEVI_WINDOWS8_PLAIN_WORDMARK((char) 0xebf4),
        DEVI_WINDOWS8_PLAIN((char) 0xebf5),
        DEVI_WORDPRESS_PLAIN_WORDMARK((char) 0xebfd),
        DEVI_WORDPRESS_PLAIN((char) 0xebfe),
        DEVI_YII_PLAIN_WORDMARK((char) 0xec01),
        DEVI_YII_PLAIN((char) 0xec02),
        DEVI_ZEND_PLAIN_WORDMARK((char) 0xec03),
        DEVI_ZEND_PLAIN((char) 0xec04);

        char deviconCharacter;

        Icon(char character) {
            this.deviconCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return deviconCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface deviconTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (deviconTypeface == null) {
                setDeviconTypeface(new Devicon());
            }
            return deviconTypeface;
        }

        private static void setDeviconTypeface(Devicon deviconTypeface) {
            Icon.deviconTypeface = deviconTypeface;
        }
    }
}
