# [Gold V] Mortal Combat - 16266

[문제 링크](https://www.acmicpc.net/problem/16266)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 20, 맞힌 사람: 20, 정답 비율: 95.238%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Vasya has started playing a new video game. In the end of the first level he is taking a combat with the level boss. He needs to win the combat to continue playing. Vasya has a squad of n heroes, the i-th of them has hi hit points and ai attack points. The boss has H hit points and A attack points.</p>

<p>The combat goes as follows.</p>

<ul>
	<li>If Vasya has no more heroes, he loses the game.</li>
	<li>If he still has at least one hero, he can choose any one and send it to fight against the boss;</li>
	<li>If Vasya has chosen the i-th hero, the combat proceeds as follows:
	<ul>
		<li>The hero attacks the boss and reduces its hit points by ai;</li>
		<li>If the boss is still alive &mdash; has strictly positive hit points &mdash; it attacks the hero and reduces its hit points by A;</li>
		<li>While the hero and the boss are both still alive, the attacks are repeated.</li>
	</ul>
	</li>
	<li>If the boss is dead, the combat is over, Vasya wins. In the other case all of the actions are repeated.</li>
</ul>

<p>Vasya doesn&#39;t want to lose many heroes at the very first level of the game. So he wants to plan the combat to lose the minimum possible number of heroes. Help him to find what is the minimal number of heroes that he can lose but still defeat the boss. If Vasya cannot defeat the boss even losing all of his heroes, output &thinsp;-&thinsp;1.</p>

<p>Let us consider sample test cases.</p>

<p>In the first test case the optimal plan is the following: first send hero 2 to the combat. It attacks the boss three times, reduce its hit points by 12, and then dies. After that Vasya must send hero 3 to the combat, it immediately reduces the hit points of the boss by 6, and the boss dies. Therefore Vasya loses one hero only.</p>

<p>In the second test case Vasya cannot kill the boss, no matter in which order he sends his heroes to the combat.</p>

### 입력

<p>Input data contains multiple test cases. The first line contains one integer t &mdash; the number of test cases (1&thinsp;&le;&thinsp;t&thinsp;&le;&thinsp;1000).</p>

<p>Each of the t test cases is described in the following way. The first line of the description contains three integers n, H and A &mdash; the number of heroes Vasya has, the number of hit points of the boss, and the number of attack points of the boss (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;10<sup>5</sup>, 1&thinsp;&le;&thinsp;H,&thinsp;A&thinsp;&le;&thinsp;10<sup>9</sup>).</p>

<p>Each of the following n lines contains two integers h<sub>i</sub>, a<sub>i</sub> &mdash; number of hit points and attack points of the i-th hero (1&thinsp;&le;&thinsp;h<sub>i</sub>,&thinsp;a<sub>i</sub>&thinsp;&le;&thinsp;10<sup>9</sup>).</p>

<p>The sum of values of n in all test cases of one input data doesn&#39;t exceed 10<sup>5</sup>.</p>

### 출력

<p>For each test case output either the minimal number of heroes that Vasya must lose to defeat the boss, or &thinsp;-&thinsp;1 if Vasya cannot defeat the boss.</p>