# [Platinum I] The Grand Noi and ICPC Battle - 15380

[문제 링크](https://www.acmicpc.net/problem/15380)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

(분류 없음)

### 문제 설명

<p>The Nois are an ancient and cultured race who have a strange fascination in mathematics and computers. They are a peaceful race, but they are now engaged in an epic war against their feared foes, the Inter-continental Prairie Corgis (known as the ICPCs in short). The war has been in progress for years, and neither side has managed to make footholds in their opponent&rsquo;s territory.</p>

<p>But now the Nois have a grand plan to finally end the war and return to their normal activities of discovering new theorems and inventing math problems. The Nois, with their devastating intellects, have managed to create a superweapon that will blast the ICPCs into an alternate dimension where math and computers do not exist (the very thought that such a dimension exists chills their bones, and the poor Noi who discovered the dimension is now locked in a psychiatric ward; but that&rsquo;s for another story). But alas, ICPC spies discovered their plan, and a saboteur managed to sneak in and ruin the configuration of the Noi superweapon.</p>

<p>The superweapon is configured using a sequence of N integers, and the Noi have devised a way to rapidly test for the right configuration. However, the only Noi who can write code to perform the tests is in a psychiatric ward, and they now desperately need help. The Noi have heard of your programming prowess, and have enlisted your help in reconfiguring their superweapon.</p>

<p>They sent you this message:</p>

<p>Help us, oh great one! We need a program to help defeat the dastardly ICPCs. When looking for the right configuration of our superweapon, we perform either of two operations on our configuration sequence (which we will refer to as A): we either set A<sub>L</sub>, A<sub>L+1</sub>, ..., A<sub>R&minus;1</sub>, A<sub>R</sub> to V (for some integers L and R), or we try to find the sum of all A<sub>i</sub>&middot;A<sub>j</sub>&middot;A<sub>k</sub> for all indices i, j, k such that L &le; i &lt; j &lt; k &le; R (for some integers L and R).</p>

### 입력

<p>The first line of input contains two integers, N and Q, separated by a single space, where N is the length of the configuration sequence, and Q is the number of operations that the Noi have to perform.</p>

<p>The next Q lines contain the operations to be performed on the configuration sequence in order, and are in either of the two following formats:</p>

<ul>
	<li><code>SET L R V</code> - Set all A<sub>L</sub>, A<sub>L+1</sub>, ..., A<sub>R&minus;1</sub>, AR to V.</li>
	<li><code>ASK L R</code> - Output the sum of all A<sub>i</sub> &middot; A<sub>j</sub> &middot; A<sub>k</sub> for all indices i, j, k such that L &le; i &lt; j &lt; k &le; R. Output the answer modulo 10<sup>8</sup>.</li>
</ul>

<p>Every element of the configuration sequence is initially set to 1.</p>

<p>Constraints</p>

<ul>
	<li>1 &le; N &le; 10<sup>9</sup></li>
	<li>1 &le; Q &le; 10<sup>5</sup></li>
	<li>1 &le; L &le; R &le; N</li>
	<li>1 &le; V &le; 10<sup>6</sup></li>
</ul>

### 출력

<p>Output M lines, where M is the number of operations of the second kind. For each such line, output a single integer S, which is the sum of all A<sub>i</sub> &middot; A<sub>j</sub> &middot; A<sub>k</sub> for all indices i, j, k such that L &le; i &lt; j &lt; k &le; R, modulo 10<sup>8</sup>.</p>