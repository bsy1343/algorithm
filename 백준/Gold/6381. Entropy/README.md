# [Gold IV] Entropy - 6381

[문제 링크](https://www.acmicpc.net/problem/6381)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 14, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 문자열

### 문제 설명

<p>An entropy encoder is a data encoding method that achieves lossless data compression by encoding a message with &ldquo;wasted&rdquo; or &ldquo;extra&rdquo; information removed. In other words, entropy encoding removes information that was not necessary in the first place to accurately encode the message. A high degree of entropy implies a message with a great deal of wasted information; english text encoded in ASCII is an example of a message type that has very hig entropy. Already compressed messages, such as JPEG graphics or ZIP archives, have very little entropy and do not benefit from further attempts at entropy encoding.&nbsp;</p>

<p>English text encoded in ASCII has a high degree of entropy because all characters are encoded using the same number of bits, eight. It is a known fact that the letters E, L, N, R, S and T occur at a considerably higher frequency than do most other letters in english text. If a way could be found to encode just these letters with four bits, then the new encoding would be smaller, would contain all the original information, and would have less entropy. ASCII uses a fixed number of bits for a reason, however: it&rsquo;s easy, since one is always dealing with a fixed number of bits to represent each possible glyph or character. How would an encoding scheme that used four bits for the above letters be able to distinguish between the four-bit codes and eight-bit codes? This seemingly difficult problem is solved using what is known as a &ldquo;prefix-free variable-length&rdquo; encoding.&nbsp;</p>

<p>In such an encoding, any number of bits can be used to represent any glyph, and glyphs not present in the message are simply not encoded. However, in order to be able to recover the information, no bit pattern that encodes a glyph is allowed to be the prefix of any other encoding bit pattern. This allows the encoded bitstream to be read bit by bit, and whenever a set of bits is encountered that represents a glyph, that glyph can be decoded. If the prefix-free constraint was not enforced, then such a decoding would be impossible.&nbsp;</p>

<p>Consider the text &ldquo;AAAAABCD&rdquo;. Using ASCII, encoding this would require 64 bits. If, instead, we encode &ldquo;A&rdquo; with the bit pattern &ldquo;00&rdquo;, &ldquo;B&rdquo; with &ldquo;01&rdquo;, &ldquo;C&rdquo; with &ldquo;10&rdquo;, and &ldquo;D&rdquo; with &ldquo;11&rdquo; then we can encode this text in only 16 bits; the resulting bit pattern would be &ldquo;0000000000011011&rdquo;. This is still a fixed-length encoding, however; we&rsquo;re using two bits per glyph instead of eight. Since the glyph &ldquo;A&rdquo; occurs with greater frequency, could we do better by encoding it with fewer bits? In fact we can, but in order to maintain a prefix-free encoding, some of the other bit patterns will become longer than two bits. An optimal encoding is to encode &ldquo;A&rdquo; with &ldquo;0&rdquo;, &ldquo;B&rdquo; with &ldquo;10&rdquo;, &ldquo;C&rdquo; with &ldquo;110&rdquo;, and &ldquo;D&rdquo; with &ldquo;111&rdquo;. (This is clearly not the only optimal encoding, as it is obvious that the encodings for B, C and D could be interchanged freely for any given encoding without increasing the size of the final encoded message.) Using this encoding, the message encodes in only 13 bits to &ldquo;0000010110111&rdquo;, a compression ratio of 4.9 to 1 (that is, each bit in the final encoded message represents as much information as did 4.9 bits in the original encoding). Read through this bit pattern from left to right and you&rsquo;ll see that the prefix-free encoding makes it simple to decode this into the original text even though the codes have varying bit lengths.&nbsp;</p>

<p>As a second example, consider the text &ldquo;THE CAT IN THE HAT&rdquo;. In this text, the letter &ldquo;T&rdquo; and the space character both occur with the highest frequency, so they will clearly have the shortest encoding bit patterns in an optimal encoding. The letters &ldquo;C&rdquo;, &ldquo;I&rsquo; and &ldquo;N&rdquo; only occur once, however, so they will have the longest codes. There are many possible sets of prefix-free variable-length bit patterns that would yield the optimal encoding, that is, that would allow the text to be encoded in the fewest number of bits. One such optimal encoding is to encode spaces with &ldquo;00&rdquo;, &ldquo;A&rdquo; with &ldquo;100&rdquo;, &ldquo;C&rdquo; with &ldquo;1110&rdquo;, &ldquo;E&rdquo; with &ldquo;1111&rdquo;, &ldquo;H&rdquo; with &ldquo;110&rdquo;, &ldquo;I&rdquo; with &ldquo;1010&rdquo;, &ldquo;N&rdquo; with &ldquo;1011&rdquo; and &ldquo;T&rdquo; with &ldquo;01&rdquo;. The optimal encoding therefore requires only 51 bits compared to the 144 that would be necessary to encode the message with 8-bit ASCII encoding, a compression ratio of 2.8 to 1.&nbsp;</p>

### 입력

<p>The input file will contain a list of text strings, one per line. The text strings will consist only of uppercase alphanumeric characters and underscores (which are used in place of spaces). The end of the input will be signalled by a line containing only the word &ldquo;END&rdquo; as the text string. This line should not be processed.&nbsp;</p>

### 출력

<p>For each text string in the input, output the length in bits of the 8-bit ASCII encoding, the length in bits of an optimal prefix-free variable-length encoding, and the compression ratio accurate to one decimal point.</p>