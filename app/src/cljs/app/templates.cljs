(ns app.templates
  (:require [cljsjs.mustache]))

(defn textmate
  [varmap]
  (.render js/Mustache "<?xml version=")1.0" encoding=\"UTF-8\"?>
<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">
<plist version=\"1.0\">
<dict>
	<key>comment</key>
	<string>{{themeauthor}}</string>
	<key>name</key>
	<string>{{themename}}</string>
	<key>settings</key>
	<array>
		<dict>
			<key>settings</key>
			<dict>
				<key>background</key>
				<string>{{mainbg}}</string>
				<key>caret</key>
				<string>{{bg3}}</string>
				<key>foreground</key>
				<string>{{mainfg}}</string>
				<key>invisibles</key>
				<string>{{bg3}}</string>
				<key>lineHighlight</key>
				<string>{{bg2}}</string>
				<key>selection</key>
				<string>{{bg3}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Comment</string>
			<key>scope</key>
			<string>comment</string>
			<key>settings</key>
			<dict>
				<key>foreground</key>
				<string>{{comment}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Foreground</string>
			<key>scope</key>
			<string>keyword.operator.class, constant.other, source.php.embedded.line</string>
			<key>settings</key>
			<dict>
				<key>fontStyle</key>
				<string></string>
				<key>foreground</key>
				<string>{{fg3}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Variable, String Link, Regular Expression, Tag Name, GitGutter deleted</string>
			<key>scope</key>
			<string>variable, support.other.variable, string.other.link, string.regexp, entity.name.tag, entity.other.attribute-name, meta.tag, declaration.tag, markup.deleted.git_gutter</string>
			<key>settings</key>
			<dict>
				<key>foreground</key>
				<string>{{variable}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Number, Constant, Function Argument, Tag Attribute, Embedded</string>
			<key>scope</key>
			<string>constant.numeric, constant.language, support.constant, constant.character, variable.parameter, punctuation.section.embedded, keyword.other.unit</string>
			<key>settings</key>
			<dict>
				<key>fontStyle</key>
				<string></string>
				<key>foreground</key>
				<string>{{constant}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Class, Support</string>
			<key>scope</key>
			<string>entity.name.class, entity.name.type.class, support.type, support.class</string>
			<key>settings</key>
			<dict>
				<key>fontStyle</key>
				<string></string>
				<key>foreground</key>
				<string>{{type}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>String, Symbols, Inherited Class, Markup Heading, GitGutter inserted</string>
			<key>scope</key>
			<string>string, constant.other.symbol, entity.other.inherited-class, entity.name.filename, markup.heading, markup.inserted.git_gutter</string>
			<key>settings</key>
			<dict>
				<key>fontStyle</key>
				<string></string>
				<key>foreground</key>
				<string>{{string}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Operator, Misc</string>
			<key>scope</key>
			<string>keyword.operator, constant.other.color</string>
			<key>settings</key>
			<dict>
				<key>foreground</key>
				<string>{{keyword}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Function, Special Method, Block Level, GitGutter changed</string>
			<key>scope</key>
			<string>entity.name.function, meta.function-call, support.function, keyword.other.special-method, meta.block-level, markup.changed.git_gutter</string>
			<key>settings</key>
			<dict>
				<key>fontStyle</key>
				<string></string>
				<key>foreground</key>
				<string>{{functionname}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Keyword, Storage</string>
			<key>scope</key>
			<string>keyword, storage, storage.type</string>
			<key>settings</key>
			<dict>
				<key>fontStyle</key>
				<string></string>
				<key>foreground</key>
				<string>{{keyword}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Invalid</string>
			<key>scope</key>
			<string>invalid</string>
			<key>settings</key>
			<dict>
				<key>background</key>
				<string>{{variable}}</string>
				<key>fontStyle</key>
				<string></string>
				<key>foreground</key>
				<string>{{mainbg}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Separator</string>
			<key>scope</key>
			<string>meta.separator</string>
			<key>settings</key>
			<dict>
				<key>background</key>
				<string>{{functionname}}</string>
				<key>foreground</key>
				<string>{{mainbg}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Deprecated</string>
			<key>scope</key>
			<string>invalid.deprecated</string>
			<key>settings</key>
			<dict>
				<key>background</key>
				<string>{{builtin}}</string>
				<key>fontStyle</key>
				<string></string>
				<key>foreground</key>
				<string>{{mainbg}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Diff foreground</string>
			<key>scope</key>
			<string>markup.inserted.diff, markup.deleted.diff, meta.diff.header.to-file, meta.diff.header.from-file</string>
			<key>settings</key>
			<dict>
				<key>foreground</key>
				<string>{{mainbg}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Diff insertion</string>
			<key>scope</key>
			<string>markup.inserted.diff, meta.diff.header.to-file</string>
			<key>settings</key>
			<dict>
				<key>background</key>
				<string>{{string}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Diff deletion</string>
			<key>scope</key>
			<string>markup.deleted.diff, meta.diff.header.from-file</string>
			<key>settings</key>
			<dict>
				<key>background</key>
				<string>{{variable}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Diff header</string>
			<key>scope</key>
			<string>meta.diff.header.from-file, meta.diff.header.to-file</string>
			<key>settings</key>
			<dict>
				<key>foreground</key>
				<string>{{mainbg}}</string>
				<key>background</key>
				<string>{{functionname}}</string>
			</dict>
		</dict>
		<dict>
			<key>name</key>
			<string>Diff range</string>
			<key>scope</key>
			<string>meta.diff.range</string>
			<key>settings</key>
			<dict>
				<key>fontStyle</key>
				<string>italic</string>
				<key>foreground</key>
				<string>{{keyword}}</string>
			</dict>
		</dict>
	</array>
	<key>uuid</key>
	<string></string>
  <key>colorSpaceName</key>
  <string>sRGB</string>
</dict>
</plist>
" (clj->js varmap))