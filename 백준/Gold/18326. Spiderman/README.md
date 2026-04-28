# [Gold IV] Spiderman - 18326

[문제 링크](https://www.acmicpc.net/problem/18326)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 91, 정답: 38, 맞힌 사람: 29, 정답 비율: 40.845%

### 분류

수학, 정수론

### 문제 설명

<p>Little Ivan likes to play Yamb and read Marvel superhero comics. His favorite superhero is spider-man, a friendly neighbourhood teenager named Peter Parker who got his superpowers via a radioactive spider bite. Ivan fantasizes that one day he will be able to jump from one skyscraper to another, just like spider-man does in the comics. During one such fantasy, he fell asleep.</p>

<p>In his dream he was no longer named Ivan, his name was Peter Parkour and, you guessed it, he was able to use his parkour<sup>1</sup> skills to jump between skyscrapers. He quickly realized that there are exactly N skyscrapers in his surroundings and he somehow knew that i-th of those skyscrapers is h<sub>i</sub> meters tall. He knows that he is able to jump from the i-th skyscraper to the j-th skyscraper if the remainder when dividing h<sub>i</sub> with h<sub>j</sub> is equal to K. Help Ivan determine, for every skyscraper, the number of other skyscrapers he can jump to.</p>

<p><sup>1</sup>Internet sensation of 2004., it was in the Bond films, the goal is to get from point A to point B as creatively as possible.</p>

### 입력

<p>The first line contains two integers N (1 &le; N &le; 300 000) and K (0 &le; K &lt; 10<sup>6</sup>) from the task description.</p>

<p>The next line contains N integers h<sub>i</sub> (1 &le; h<sub>i</sub> &le; 10<sup>6</sup>) from the task description.</p>

### 출력

<p>In a single line you should output N space-separated integers such that the i-th of those integers represents the number of different skyscrapers on which Peter Parkour can jump on if he jumps from the i-th skyscraper.</p>

### 힌트

<p>Clarification of the third example:</p>

<ul>
	<li>From the first skyscraper of height 1 Peter can jump on any other skyscraper.</li>
	<li>From the second skyscraper of height 3 Peter can jump only on a skyscraper of height 2.</li>
	<li>From the third skyscraper of height 5 Peter can jump only on a skyscraper of height 2.</li>
	<li>From the fourth skyscraper of height 7 Peter can jump on skyscrapers of heights 2 and 3.</li>
	<li>From the fifth skyscraper of height 2 Peter cannot jump on any other skyscraper.</li>
</ul>