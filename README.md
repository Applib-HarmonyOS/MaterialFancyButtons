# MaterialFancyButtons

MaterialFancyButtons is a library that provides highly customizable buttons, with options to include icons made of Element graphics or icon-fonts loaded from font files. Using this library, one can effortlessly design attractive and aesthetic buttons to go along with the theme of the UI. It supports 21 precompiled icon-fonts and provides an interface to easily include new fonts.

# Source

Inspired by library MaterialFancyButtons (v1.8.7) by [Joielechong](http://www.github.com/joielechong):

https://github.com/joielechong/MaterialFancyButtons

The library author has also credited the following contributors:

- [El Mehdi Sakout](http://twitter.com/medyo80)
- [mikepenz.com](http://mikepenz.com)

## Features

The following parameters can be adjusted to design the button as per requirement.

* Border (stroke, radius, color)
    * Top left border
    * Top right border
    * Bottom left border
    * Bottom right border
* Background (normal, focus)
* Button Icon using an Element with graphics of your choice
* Button Icon using a icon-font, with the precompiled icon-font options below:
    * [Community Material](http://materialdesignicons.com/)
    * [Devicon](http://devicon.fr/)
    * [Dripicons](http://demo.amitjakhu.com/dripicons/)
    * [Entypo](http://www.entypo.com/)
    * [Fontawesome](http://fontawesome.io)
    * [Foundation Icons](http://zurb.com/playground/foundation-icon-fonts-3)
    * [Glyphicons Halflings](http://glyphicons.com/)
    * [Google Material Design Icons](https://github.com/google/material-design-icons)
    * [Ionicons](http://ionicons.com/)
    * [Material Design Iconic Font](http://zavoloklom.github.io/material-design-iconic-font)
    * [MFGLabs Iconset](https://github.com/MfgLabs/mfglabs-iconset)
    * [Meteocons](http://www.alessioatzeni.com/meteocons/)
    * [Mobirise Icons](https://mobiriseicons.com/)
    * [Octicons](https://github.com/github/octicons)
    * [Open Iconic](https://useiconic.com/)
    * [PICOL](http://picol.org/)
    * [Pixden7Stroke](http://themes-pixeden.com/font-demos/7-stroke/)
    * [Themify Icons](http://themify.me/themify-icons)
    * [Typeicons](http://typicons.com/)
    * [Vaadin Icons](https://github.com/vaadin/vaadin-icons/)
    * [Weather Icons](https://erikflowers.github.io/weather-icons/)
* Provisions to add Custom Fonts for buttons, custom text fonts and also custom icon-fonts.
* Icon (Position, size)
    * right
    * left
    * top
    * bottom
* Icon Size
* Icon Padding

The Button can be created using XML code with supported XML attributes or instantiated using Java code.

## Dependency

### Adding Main Library

1. For using MaterialFancyButtons module in sample app, include the source code and add the below dependencies in entry/build.gradle to generate hap/support.har.
``` gradle
	dependencies {
		implementation project(':materialfancybutton')
        	testCompile 'junit:junit:4.12'
	}
```
2. For using MaterialFancyButtons module in separate application using har file, add the har file in the entry/libs folder and add the dependencies in entry/build.gradle file.
``` gradle
	dependencies {
		implementation fileTree(dir: 'libs', include: ['*.har'])
		testCompile 'junit:junit:4.12'
	}
```

### Adding Icon-Font Modules

1. For using any of the precompiled icon-font libraries in sample app, include the source code for the icon font libraries required and add the required dependencies from below list in entry/build.gradle to generate hap/support.har.
``` gradle
	dependencies {
		implementation project(':materialfancybutton')
		implementation project(':community_material_typeface')
		implementation project(':devicon_typeface')
		implementation project(':dripicons_typeface')
		implementation project(':entypo_typeface')
		implementation project(':fontawesome_typeface')
		implementation project(':foundation_icons_typeface')
		implementation project(':glyphicons_halflings_typeface')
		implementation project(':google_material_typeface')
		implementation project(':ionicons_typeface')
		implementation project(':material_design_iconic_typeface')
		implementation project(':meteocons_typeface')
		implementation project(':mfglabs_iconset_typeface')
		implementation project(':mobirise_icons_typeface')
		implementation project(':octicons_typeface')
		implementation project(':open_iconic_typeface')
		implementation project(':picol_typeface')
		implementation project(':pixeden_7_stroke_typeface')
		implementation project(':themify_icons_typeface')
		implementation project(':typicons_typeface')
		implementation project(':vaadin_icons_typeface')
		implementation project(':weather_icons_typeface')
		testImplementation 'junit:junit:4.13'
	}
```

*Note that all dependencies given above are not required. Only add the dependencies to the icon-font modules that are needed for the current project. E.g. If using Entypo and VaadinIcons typefaces only, then only add the dependencies `implementation project(':entypo_typeface')` and `implementation project(':vaadin_icons_typeface')`.*

2. For using any of the precompiled icon-font libraries in separate application using har file, add the har file in the entry/libs folder and add the dependencies in entry/build.gradle file.
``` gradle
	dependencies {
		implementation fileTree(dir: 'libs', include: ['*.har'])
		testCompile 'junit:junit:4.12'
	}
```

### Adding Font Files

Add the associated font .ttf file of the icon-font modules added to the rawfile directory of the application. E.g. If using octicons_typeface module, add the file [octicons-v3.2.0.ttf](entry/src/main/resources/rawfile/octicons-v3.2.0.ttf) into the directory resources/rawfile, in the resource directory of the application. 
 
*Note: Without adding the font files to the rawfile directory, the associated typeface modules will not display the desired font-icons. So, ensure that for all the added icon-font modules, the corresponding font file is also added.* Each icon-font module has an associated font file. To find the font files corresponding to the modules, refer to the [rawfile directory of this repository's sample app.](entry/src/main/resources/rawfile). It contains all the font files of the supported typeface modules.

**Icon Font List:**
	
The details of the precompiled icon-font modules are given below. The following list is within this format:
* Font Icon link
  * "Prefix", this is prefix for each icon in the font
  * `implementation project...'`, this is the dependency to use the icon font.
  * "fontname.ttf" this is the corresponding font file to be added to the resources/rawfile directory of the application.

 **Icon List:**

* [Community Material](http://materialdesignicons.com/)
  * "CMDI"
  * `implementation project(':community_material_typeface')`'
  * [communitymaterial-font-v1.9.32.ttf](entry/src/main/resources/rawfile/communitymaterial-font-v1.9.32.ttf)

* [Devicon](http://devicon.fr/)
  * "DEVI"
  * `implementation project(':devicon_typeface')`
  * [devicon-font-v2.0.0.1.ttf](entry/src/main/resources/rawfile/devicon-font-v2.0.0.1.ttf)

* [Dripicons](http://demo.amitjakhu.com/dripicons/)
  * "DRPI"
  * `implementation project(':dripicons_typeface')`
  * [dripicons-v2.ttf](entry/src/main/resources/rawfile/dripicons-v2.ttf)

* [Entypo](http://www.entypo.com/)
  * "ENTI"
  * `implementation project(':entypo_typeface')`
  * [entypo-font-v1.0.0.1.ttf](entry/src/main/resources/rawfile/entypo-font-v1.0.0.1.ttf)

* [FontAwesome](http://fontawesome.io)
  * "FAWI"
  * `implementation project(':fontawesome_typeface')`
  * [fontawesome-font-v4.7.ttf](entry/src/main/resources/rawfile/fontawesome-font-v4.7.ttf)

* [Foundation Icons](http://zurb.com/playground/foundation-icon-fonts-3)
  * "FOUI"
  * `implementation project(':foundation_icons_typeface')`
  * [foundation-icons-font-v3.0.0.1.ttf](entry/src/main/resources/rawfile/foundation-icons-font-v3.0.0.1.ttf)

* [Glyphicons Halflings](http://glyphicons.com/)
  * "GLYI"
  * `implementation project(':glyphicons_halflings_typeface')`
  * [glyphicons-halflings-regular.ttf](entry/src/main/resources/rawfile/glyphicons-halflings-regular.ttf)

* [Google Material Design Icons](https://github.com/google/material-design-icons)
  * "GMDI"
  * `implementation project(':google_material_typeface')`
  * [googlematerial.ttf](entry/src/main/resources/rawfile/googlematerial.ttf)

* [Ionicons](http://ionicons.com/)
  * "IONI"
  * `implementation project(':ionicons_typeface')`
  * [ionicons.ttf](entry/src/main/resources/rawfile/ionicons.ttf)

* [Material Design Iconic Font](http://zavoloklom.github.io/material-design-iconic-font)
  * "GMII"
  * `implementation project(':material_design_iconic_typeface')`
  * [material-design-iconic-font-v2.2.0.ttf](entry/src/main/resources/rawfile/material-design-iconic-font-v2.2.0.ttf)

* [MFGLabs Iconset](https://github.com/MfgLabs/mfglabs-iconset)
  * "MFGI"
  * `implementation project(':mfglabs_iconset_typeface')`
  * [mfglabsiconset-webfont-1.0.ttf](entry/src/main/resources/rawfile/mfglabsiconset-webfont-1.0.ttf)

* [Meteocons](http://www.alessioatzeni.com/meteocons/)
  * "METI"
  * `implementation project(':meteocons_typeface')`
  * [meteocons.ttf](entry/src/main/resources/rawfile/meteocons.ttf)

* [Mobirise Icons](https://mobiriseicons.com/)
  * "MBRI"
  * `implementation project(':mobirise_icons_typeface')`
  * [mobirise-icons-v1.0.0.ttf](entry/src/main/resources/rawfile/mobirise-icons-v1.0.0.ttf)

* [Octicons](https://github.com/github/octicons)
  * "OCTI"
  * `implementation project(':octicons_typeface')`
  * [octicons-v3.2.0.ttf](entry/src/main/resources/rawfile/octicons-v3.2.0.ttf)

* [Open Iconic](https://useiconic.com/)
  * "OPIC"
  * `implementation project(':open_iconic_typeface')`
  * [open-iconic-1.1.1.ttf](entry/src/main/resources/rawfile/open-iconic-1.1.1.ttf)

* [PICOL](http://picol.org/)
  * "PICI"
  * `implementation project(':picol_typeface')`
  * [picol-v1.1.ttf](entry/src/main/resources/rawfile/picol-v1.1.ttf)

* [Pixden7Stroke](http://themes-pixeden.com/font-demos/7-stroke/)
  * "PE7I"
  * `implementation project(':pixeden_7_stroke_typeface')`
  * [pixeden-7-stroke-font-v1.2.0.ttf](entry/src/main/resources/rawfile/pixeden-7-stroke-font-v1.2.0.ttf)

* [Themify Icons](http://themify.me/themify-icons)
  * "THEI"
  * `implementation project(':themify_icons_typeface')`
  * [themify-icons-v0.1.2.ttf](entry/src/main/resources/rawfile/themify-icons-v0.1.2.ttf)

* [Typicons](http://typicons.com/)
  * "TYPI"
  * `implementation project(':typicons_typeface')`
  * [typicons-font-v2.0.7.1.ttf](entry/src/main/resources/rawfile/typicons-font-v2.0.7.1.ttf)

* [Vaadin Icons](https://github.com/vaadin/vaadin-icons/)
  * "VAAI"
  * `implementation project(':vaadin_icons_typeface')`
  * [vaadin-icons-v4.1.0.ttf](entry/src/main/resources/rawfile/vaadin-icons-v4.1.0.ttf)

* [Weather Icons](https://erikflowers.github.io/weather-icons/)
  * "WICI"
  * `implementation project(':weather_icons_typeface')`
  * [weather-icons-v2.0.10.ttf](entry/src/main/resources/rawfile/weather-icons-v2.0.10.ttf)

Licenses for all included fonts are linked inside the class or can be found on the corresponding repositories.


## Usage

Given below is a basic usage example of this library.

1. Add MaterialFancyButton to your dependencies:
```gradle
	implementation project(':materialfancybutton')
```

2. Include MaterialFancyButton namespace to the root element in the layout file:

``` xml
	xmlns:fancy="http://schemas.huawei.com/hap/res-auto"
```

3. Add the MaterialFancyButton Component:

``` xml
    <com.rilixtech.materialfancybutton.MaterialFancyButton
	ohos:height="match_content"
	ohos:width="match_content"
	ohos:id="$+id:btn_example"
	fancy:mfb_text="Example Button"/>
```

4. Select the font that you want to use, for example FontAwesome. Add it as a dependency:
```gradle
implementation project(':fontawesome_typeface')
```
The list of supported font characters for FontAwesome are included in the Enum FontAwesome.Icon.

5. Copy the [fontawesome-font-v4.7.ttf](entry/src/main/resources/rawfile/fontawesome-font-v4.7.ttf) file into the `resources/rawfile` directory of your application. E.g. If the application runs through the default entry module, this directory will be `entry/src/main/resources/rawfile`.

6. - Add the attribute for icon font character that you want, for example star icon. It should be in `PREFIX_ICON_NAME` format.
    Because we use FontAwesome the prefix is `FAWI` and the icon character is `FAWI_STAR`. Use `fancy:mfb_icon` attribute:

``` xml
fancy:mfb_icon="FAWI_STAR"
```

 Therefore, the xml tag becomes:

``` xml
<com.rilixtech.materialfancybutton.MaterialFancyButton
    ohos:height="match_content"
    ohos:width="match_content"
    ohos:id="$+id:btn_example"
    fancy:mfb_text="Example Button"
    fancy:mfb_icon="FAWI_STAR"/>
```

The library will, upon encountering the prefix `FAWI`, search and load the FontAwesome font from the provided font file in the rawfile directory. Therefore, the file name does not need to be explicitly specified in the xml tag.

**This is the recommended way**, so you don't need to manually load the font from file and remember all the characters of the font, which is very tedious and error prone.

### Custom Font
If you want to use custom Font, follow these easy steps:

1 - Paste your font inside the `resources/rawfile` directory of the application. E.g. If the application runs through the default entry module, this directory will be `entry/src/main/resources/rawfile`.

2 - Then add the following attribute:

 For text:

``` xml
    fancy:mfb_textFont="robotothin.ttf"
    fancy:mfb_text="Text written in Roboto Thin Font."
```
So it will look like this:
``` xml
<com.rilixtech.materialfancybutton.MaterialFancyButton
    ohos:id="$+id:btn_example"
    ohos:height="match_content"
    ohos:width="match_content"
    fancy:mfb_textFont="robotothin.ttf"
    fancy:mfb_text="Text written in Roboto Thin Font."/>
```

 For icon:
``` xml
    fancy:mfb_iconFont="fontawesome-font-v4.7.ttf"
    fancy:mfb_fontIconResource="&#xf087;"
```
So it will look like this:
``` xml
<com.rilixtech.materialfancybutton.MaterialFancyButton
   ohos:id="$+id:btn_example"
   ohos:height="match_content"
   ohos:width="match_content"
   fancy:mfb_iconFont="fontawesome-font-v4.7.ttf"
   fancy:mfb_fontIconResource="&#xf087;"
   fancy:mfb_text="Thumbs Up Button"/>
```

The above code will load the FontAwesome font and display the unicode character 0xF087 as an icon for the button. As per FontAwesome v4.7 font, this character will display as a "Thumbs Up". But, remembering the unicode mapping of each special font character is tedious, moreover the font file name would have to be repeatedly specified for every tag. So, an easy alternative would be to use the attribute `fancy:mfb_icon="FAWI_THUMBS_O_UP"` instead. Therefore, this approach is suitable only when using icon-fonts that are not currently supported by this library.

**Please note** that when using `fancy:mfb_icon` you don't need to use `fancy:mfb_iconFont` and `fancy:mfb_fontIconResource`. If either attribute is present, they will be overriden by the `fancy:mfb_icon` attribute and ignored.

####  Supported Attributes

| XML Attribute        | Java Method           | Description  |
| ------------- |:-------------:| -----:|
| fancy:mfb_text      | setText(String)     | Text of the button. Overriden by ohos:text if included. Default: "BUTTON" |
| fancy:mfb_textColor     | setTextColor(int)      |  Text Color of the button. Default: White (#FFFFFFFF) |
| fancy:mfb_textSize | setTextSize(int)      |    Size of the text. Default: 16fp |
| fancy:mfb_textFont | setCustomTextFont(String)      |    Font Family of the text. If included, ensure it is the name of a font file in the rawfile directory. Default: System Default Font|
| fancy:mfb_textGravity | setTextGravity(Int)      |    Alignment of the text. Refer to AttrEnumUtil.MfbTextGravity to view supported arguments. Default: MfbTextGravity.CENTER|
| fancy:mfb_icon | setIcon(String) | Set icon from icon font list. Need the font library (fontawesome_typeface_library, etc) to work. This will override fancy:mfb_fontIconResource and fancy:mfb_iconFont. Default: No icon |
| fancy:mfb_iconResource | setIconResource(Element)      |    Element icon of the button. Element icon is separate from the icon-font. Default: No element icon|
| fancy:mfb_iconPosition | setsetIconPosition(int)      |    Position of the icon : Left, Right, Top, Bottom. Refer to MaterialFancyButton.POSITION_LEFT, POSITION_RIGHT etc. Default: POSITION_LEFT |
| fancy:mfb_fontIconResource | setIcon(char), setIconResource(String)      |    The unicode value(s) of the font icon of the button. This is not required if using mfb_icon attribute. Default: No icon. |
| fancy:mfb_fontIconSize | setFontIconSize(int)      |    Size of the icon-font. Note that this will scale the icon-font but not the Element icon. Default: 40fp|
| fancy:mfb_iconFont | setCustomIconFont(String)      |    Font Family of the icon. If included, ensure it is the name of a font file in the rawfile directory. This setting will not affect the font of the text. Default: No icon or Font decided using prefix of mfb_icon attribute.|
| fancy:mfb_borderWidth | setBorderWidth(int)      |    Width of the border. Default: 0 px|
| fancy:mfb_borderColor | setBorderColor(int)      |    Color of the border. Default: Color Black (#000000)|
| fancy:mfb_defaultColor | setBackgroundColor(int)      |    Background color of the button. Default: Color Black (#000000)|
| fancy:mfb_focusColor | setFocusBackgroundColor(int)      |    Focus Color of button background. Default: Color Black (#000000)|
| fancy:mfb_disabledColor | setDisableBackgroundColor(int)      |    Disabled Color of button background. Default: #f6f7f9|
| fancy:mfb_disabledTextColor | setDisableTextColor(int)      |    Disabled Color of button text. Default: #bec2c9|
| fancy:mfb_disabledBorderColor | setDisableBorderColor(int)      |    Disabled Color of button border. Default: #dddfe2|
| fancy:mfb_radius | setRadius(int)      |    Radius of the corners of the button. Default: 0 px|
| fancy:mfb_radiusTopLeft | setRadiusTopLeft(int)      |    Radius top left of the button. Default: As per mfb_radius attribute|
| fancy:mfb_radiusTopRight | setRadiusTopRight(int)      |    Radius top right of the button. Default: As per mfb_radius attribute|
| fancy:mfb_radiusBottomLeft | setRadiusBottomLeft(int)      |    Radius bottom left of the button. Default: As per mfb_radius attribute|
| fancy:mfb_radiusBottomRight | setRadiusBottomRight(int)      |    Radius bottom right of the button. Default: As per mfb_radius attribute|
| fancy:mfb_iconPaddingLeft | setIconPadding(int,int,int,int)      |    Icon Padding Left. Default: 10 px|
| fancy:mfb_iconPaddingRight | setIconPadding(int,int,int,int)      |    Icon Padding Right. Default: 10 px|
| fancy:mfb_iconPaddingTop | setIconPadding(int,int,int,int)      |    Icon Padding Top. Default: 0 px|
| fancy:mfb_iconPaddingBottom | setIconPadding(int,int,int,int)      |    Icon Padding Bottom. Default: 0 px|
| fancy:mfb_ghost | setGhost(boolean)      |    Change button appearance to be like a "Ghost" (Hollow). Default: false|

For setting the radius of the button, you can also use `setRadius(int radiusTopLeft, int radiusTopRight, int radiusBottomLeft, int radiusBottomRight)`

Also you can use Attributes with default prefix (ohos:), which makes migrating of your project more fast.
Default Attributes have more priority than Attributes with prefix fancy, therefore, they will override equivalent fancy attributes, if applicable.

#### Supported default Attributes
| XML Attribute    |
| ------------- |
| ohos:enabled |
| ohos:text |
| ohos:text_size |

####  Supported Getters

| Method        | Description  |
| ------------- | -----:|
| getText() | Returns Text String of the button|
| getTextViewObject() | Returns Text Object|
| getIconFontObject() | Returns icon defined by mfb_fontIconResource|
| getIconImageObject() | Returns icon defined by mfb_iconResource |

#### Sample

**1 - Spotify Button**

![MaterialFancyButton Spotify](images/sample_button1.png)

```xml
  <com.rilixtech.materialfancybutton.MaterialFancyButton
      ohos:id="$+id:btn_spotify"
      ohos:width="match_content"
      ohos:height="match_content"
      ohos:bottom_padding="10vp"
      ohos:left_padding="20vp"
      ohos:right_padding="20vp"
      ohos:top_padding="10vp"
      fancy:mfb_borderColor="#FFFFFF"
      fancy:mfb_borderWidth="1vp"
      fancy:mfb_defaultColor="#7ab800"
      fancy:mfb_focusColor="#9bd823"
      fancy:mfb_iconFont="fontawesome-font-v4.7.ttf"
      fancy:mfb_fontIconResource="&#xf04b;"
      fancy:mfb_iconPosition="left"
      fancy:mfb_radius="30vp"
      fancy:mfb_text="SHUFFLE PLAY"
      fancy:mfb_textColor="#FFFFFF" />
```
**2 - Facebook Button**

![MaterialFancyButton Facebook](images/sample_button2.png)
``` java
    MaterialFancyButton facebookLoginBtn = new MaterialFancyButton(this);
    facebookLoginBtn.setText("Login with Facebook");
    facebookLoginBtn.setBackgroundColor(Color.getIntColor("#3b5998"));
    facebookLoginBtn.setFocusBackgroundColor(Color.getIntColor("#5474b8"));
    facebookLoginBtn.setTextSize(17);
    facebookLoginBtn.setRadius(16);
    facebookLoginBtn.setIconPadding(16, 32, 16, 32);
    facebookLoginBtn.setIconFont("fontawesome-font-v4.7.ttf");
    char facebookIconUnicodeId = (char) 0xf082;
    facebookLoginBtn.setIcon(facebookIconUnicodeId);
    facebookLoginBtn.setIconPosition(MaterialFancyButton.POSITION_LEFT);
    facebookLoginBtn.setFontIconSize(30);
```

See the [example project](entry) and associated [layouts folder](entry/src/main/resources/layout) for more samples. Every supported font module has an example layout file. To view all the examples, run the sample app through the entry module. It is also possible to define a button entirely using Java code, as shown in [ProgramButtonsSlice.java](entry/src/main/java/com/rilixtech/materialfancybuttons/slice/ProgramButtonsSlice.java).


- - - -

![MaterialFancyButtons](/images/sample_screenshot1.png)![MaterialFancyButtons](/images/sample_screenshot2.png)

![MaterialFancyButtons](/images/sample_screenshot3.png)![MaterialFancyButtons](/images/sample_screenshot4.png)

### FAQ

**How to add new fonts ?**
Just Paste your font inside `resources/rawfile` folder of the application. E.g. If the application runs through the default entry module, this directory will be `entry/src/main/resources/rawfile`. Use the xml tags `fancy:fontText` and `fancy:fontIcon` or corresponding Java functions `setCustomTextFont` and `setIconFont`. Refer to "Custom Font" section of this readme for an example.

## Future Work
All contributions are welcome. Some of the currently missing features are:
* Supporting Circular buttons
* Add elevation (Material Design)

# License

    Copyright 2017 Joielechong

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
