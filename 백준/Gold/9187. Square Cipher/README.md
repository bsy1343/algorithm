# [Gold IV] Square Cipher - 9187

[문제 링크](https://www.acmicpc.net/problem/9187)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 12, 맞힌 사람: 12, 정답 비율: 30.769%

### 분류

구현, 문자열

### 문제 설명

<p>In Dorothy Sayers&#39; novel &quot;Have His Carcass&quot;, Lord Peter Wimsey describes a cryptography technique that is simple for encoding and decoding, yet relatively hard to crack. &nbsp;Your job is to implement this technique.</p>

<p>Here&#39;s how it works, in Sayers&#39; (edited) words:</p>

<p>You choose a key-word of six letters or more, none of which recurs. &nbsp;Such as, for example, SQUANDER. &nbsp;Then you make a diagram of five squares each way and write the key-word in the squares like this:</p>

<pre>
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|  S  |  Q  |  U  |  A  |  N  |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|  D  |  E  |  R  |     |     |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|     |     |     |     |     |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|     |     |     |     |     |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|     |     |     |     |     |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
</pre>

<p>Then you fill up the remaining spaces with the rest of the alphabet in order, leaving out the ones you&#39;ve already got.</p>

<p>You can&#39;t put twenty-six letters in twenty-five spaces, so you pretend you&#39;re an ancient Roman or a medieval monk and treat I and J as one letter. &nbsp;So you get this:</p>

<pre>
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|  S  |  Q  |  U  |  A  |  N  |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|  D  |  E  |  R  |  B  |  C  |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|  F  |  G  |  H  |  IJ |  K  |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|  L  |  M  |  O  |  P  |  T  |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
|     |     |     |     |     |
|  V  |  W  |  X  |  Y  |  Z  |
|     |     |     |     |     |
+-----+-----+-----+-----+-----+
</pre>

<p>Now let&#39;s take a message -- What shall we say? &#39;All is known, fly at once&#39; -- that classic hardy perennial. &nbsp;We write it down all of a piece and break it into groups of two letters, reading from left to right. &nbsp;It won&#39;t do to have two of the same letters coming together in a pair, so where that happens, we shove in a Q, which won&#39;t confuse the reader. &nbsp;Now our message runs:</p>

<pre>
AL QL IS KN OW NF LY AT ON CE</pre>

<p>If there is an odd letter at the end, we&#39;d add on another Q to square &nbsp;it up. &nbsp;Now we take our first group, AL. &nbsp;We see that they come at the corners of a rectangle in which the other corners are SP. &nbsp;So we put &nbsp;down SP for the first two letters of the coded message. &nbsp;In the same way, QL becomes SM and IS becomes FA.</p>

<p>Ah, but here&#39;s KN. &nbsp;They both come on the same vertical line. &nbsp;In this case you take the letter next below each -- TC. &nbsp;Next comes OW, which translates to MX. &nbsp;Going on, SK, PV, NP, TU... If your first &nbsp; &nbsp;diagonal went from bottom to top, you must take it the same way again. &nbsp;ON = TU, NO would be UT.  CE come on the same horizontal line. &nbsp;In that case, you take the letter to the right of each. &nbsp;Since there isn&#39;t a letter to the right of C, you start again at the beginning of the line, producing DR.. Your coded message stands now:</p>

<pre>
SP SM FA TC MX SK PV NP TU DR</pre>

<p>To make it look pretty and not give the method away, you can break it up into any lengths you like, or you can embellish it with punctuation as haphazard:</p>

<pre>
S.P. SMFA. TCMXS, KPVM, PT! UDR.</pre>

<p>It&#39;s very ingenious. &nbsp;You can&#39;t guess it by way of the most frequent letter, because you get a different letter for each time, according as it&#39;s grouped to the next letter. &nbsp;And you can&#39;t guess individual words, because you don&#39;t know where the words begin and end. &nbsp;Is it at all possible to decode it without the key-word?</p>

<p style="text-align: center;">&quot;Oh dear, yes,&quot; said Wimsey. &nbsp;&quot;Any code ever coded can be decoded &nbsp;with pains and patience...&quot;</p>

### 입력

<p>The input for your program will be a series of keywords and messages to encode, alternating line-by-line, until the end-of-file flag of 999. &nbsp;Using the above technique, you are to encode the message, using the word.</p>

<p>Input will be in upper case and will contain no punctuation. &nbsp;Unlike Sayers&rsquo; example, letters may occur more than once in the key-words, in which case you must ignore all but the first occurrence of the letter.</p>

### 출력

<p>Print each message, encrypted, using two letter groups and no punctuation, separated by a single white space. Separate each message by one blank line.&nbsp;Print an I for IJ.</p>

### 힌트

<p>If the last letter is both odd and repeated, treat it as repeated and put the &#39;Q&#39; before it, not afterward. &nbsp;That is, ALL becomes ALQL for encoding purposes.</p>

<p>In the unlikely case of two Qs in a row, insert a Z between them. Also, augment odd-length messages ending with a Q by using a Z. &nbsp;Thus, FAQQAD becomes FAQZQADQ and HUQ becomes HUQZ for encoding.</p>