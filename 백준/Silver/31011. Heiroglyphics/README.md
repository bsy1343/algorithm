# [Silver II] Heiroglyphics - 31011

[문제 링크](https://www.acmicpc.net/problem/31011)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 20, 맞힌 사람: 15, 정답 비율: 34.884%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>An excavation of some newly discovered buildings recently found on the lost continent of Atlantis have yielded a surplus of new hieroglyphs. The hieroglyphs are written on tablets and each symbol is a short sequence of 6 characters containing bars and/or circles (similar to the look of binary code). Your fellow archaeologists have recovered several sets of unblemished tablets and have deciphered their meaning. From these tablets a possible grammar and alphabet has been proposed. However there are many imperfect tablets with lost information. Your job is to determine how many different letter combinations in a tablet are possible given a sequence of symbols that have missing or undecipherable parts.</p>

<p>Your fellow archeologists have noted that there are special &quot;vowel&quot; symbols that have special rules. For this problem these patterns are rules that can be applied to any tablet. So far no one has encountered a tablet with a vowel followed by another vowel, nor has anyone come across a tablet without a single vowel. From this you can safely deduce the format of a tablet.</p>

<p>Vowels:</p>

<pre>
110101
101101
010101
111011
</pre>

<p>Other discovered symbols:</p>

<pre>
110111
110011
110000
101111
101011
101000
010111
010011
010000
111101
111111
111000
</pre>

### 입력

<p>The first line of input is an integer N (1 &le; N &le; 100) which determines the number of tablets to test. The first line of input for each test case begins with an integer S (1 &le; S &le; 1000) determining the number of letters in a word. Each of the next S lines will contain 6 characters chosen from &#39;0&#39;, &#39;1&#39; or &#39;?&#39;, respectively indicating a circle, a bar or a missing character.</p>

### 출력

<p>For each test case print out the number of possible words the tablet could have, assuming the tablet follows the grammar rules above and only uses known letters. If there are over 10000 different possible words, print &quot;CANNOT DECIPHER&quot;</p>