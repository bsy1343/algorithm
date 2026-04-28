# [Gold II] Grudanje - 18272

[문제 링크](https://www.acmicpc.net/problem/18272)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 27, 맞힌 사람: 27, 정답 비율: 62.791%

### 분류

이분 탐색, 매개 변수 탐색, 누적 합

### 문제 설명

<p>Patrik loves to study the words in English language. He especially loves words that contain exactly N letters. When he sees such a word, he instantly starts observing Q of its subwords and for each of those subwords he determines whether all of its letters are distinct. If that is the case for each of the Q subwords, then he considers the original word to be perfect.</p>

<p>Kre&scaron;imir doesn&rsquo;t love studying English words, he loves to throw snowballs at Patrik instead. On a cold, winter morning, he was walking around town carrying exactly N snowballs and stumbled upon Patrik who was observing a giant N-lettered word that was written on the wall by some hooligans. What a coincidence. . .</p>

<p>Kre&scaron;imir fiercely threw the first snowball in Patrik&rsquo;s direction, but Patrik skillfully dodged the snowball so it hit and completely covered the p<sub>1</sub>-st letter of the word on a wall. In a similar manner, Kre&scaron;imir failed to hit Patrik with the next (N &minus; 1) snowballs. More precisely, his i-th snowball missed Patrik and completely covered the p<sub>i</sub>-th letter of the word on a wall. Interestingly enough, after Kre&scaron;imir threw all of the snowballs, the entire word was covered in snow.</p>

<p>Patrik glanced at the completely covered word and concluded that it was perfect. Therefore, he needed to slightly alter his definition of a perfect word. The word is perfect in none of the Q subwords contain two equal letters that are not covered in snow. Now he wants to know after which snowball (possibly zero) did the word on the wall become perfect.</p>

### 입력

<p>The first line contains a word that consists of N (1 &le; N &le; 10<sup>5</sup>) lowercase letters from the English alphabet.</p>

<p>The second line contains an integer Q (1 &le; Q &le; 10<sup>5</sup>) from the task description.</p>

<p>The i-th of the next Q lines contains two integers a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub> &le; b<sub>i</sub> &le; N) which denote that the i-th of the Q subwords from the task description spans from a<sub>i</sub>-th to the b<sub>i</sub>-th letter of the word on a wall.</p>

<p>The next line contains N different integers p<sub>i</sub> (1 &le; p<sub>i</sub> &le; N) from the task description.</p>

### 출력

<p>In the only line you should output after which snowball (possibly zero) did the word on the wall become perfect.</p>

### 힌트

<p>Clarification of the second example:</p>

<p>The state of the word on the wall after each thrown snowball is:</p>

<pre>
abbab*ab
ab*ab*ab
ab*a**ab
*b*a**ab
*b****ab
******ab
*******b
********</pre>