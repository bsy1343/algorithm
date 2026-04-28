# [Silver IV] Easy Quest - 15287

[문제 링크](https://www.acmicpc.net/problem/15287)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 184, 정답: 96, 맞힌 사람: 77, 정답 비율: 51.333%

### 분류

그리디 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>A young hero is starting his heroic life. The wise wizard suggested him an easy first quest. During this quest our young hero meets n magical creatures, in specific order. In order to help the young hero, the wizard gave him a clue &mdash; a list of n integers a<sub>i</sub>.</p>

<ul>
	<li>If a<sub>i</sub> is positive, then the i-th magical creature is benevolent and gives to our hero one magical item of type a<sub>i</sub>. The hero can keep several items of the same type.</li>
	<li>If ai is negative, then the i-th magical creature is evil and in order to defeat it the young hero needs one magical item of type &minus;a<sub>i</sub>. All magical items are fragile and can be used only once.</li>
	<li>If a<sub>i</sub> is zero, then the i-th creature is a unicorn. It gives the hero any magical item he asks for, but only one.</li>
</ul>

<p>Your task is to help the young hero to finish the first quest, defeating all enemies on the way, or say that it is impossible.</p>

### 입력

<p>The first line of input contains one integer n (1 &le; n &le; 1000). The second line contains n integers a<sub>i</sub> (&minus;1000 &le; a<sub>i</sub> &le; 1000).</p>

### 출력

<p>If it is impossible to defeat all enemies, then output one string &ldquo;No&rdquo;. If it is possible, then output string &ldquo;Yes&rdquo;, and in the next line output the types of items the hero should ask the unicorns for, in order they meet during the quest. Types must be integers in range from 1 to 1000 inclusive. If there are several solutions, output any of them.</p>