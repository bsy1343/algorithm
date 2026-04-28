# [Gold II] Magic Weapon - 16246

[문제 링크](https://www.acmicpc.net/problem/16246)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 13, 맞힌 사람: 11, 정답 비율: 23.404%

### 분류

애드 혹, 포함 배제의 원리, 수학

### 문제 설명

<p>To create the magic weapon Space Rangers need to use three details: green, red and blue.</p>

<p>Green, Red and Blue rangers want to know how many different ways they have to create the weapon. Each ranger has several details, Green Ranger has green details, Red Ranger has red details, Blue Ranger has blue details.</p>

<p>Each detail has its model number. To create the weapon rangers need to follow three rules:</p>

<ul>
	<li>The first digit of the model number of the red detail must be equal to the last digit of the model number of the green detail.</li>
	<li>The last digit of the model number of the red detail must be equal to the first digit of the model number of the blue detail.</li>
	<li>Model numbers of all three details must be different.</li>
</ul>

<p>Two ways to create the weapon are considered different if at least one ranger uses another detail, even if its model number is the same.</p>

<p>For each ranger you are given model numbers of their details. One ranger can have several details with the same model number.</p>

<p>Help rangers to find out how many different ways to create the magic weapon they have.</p>

### 입력

<p>The first line of input contains three integers: g, r and b &mdash; the number of details that Green Ranger, Red Ranger and Blue Ranger have, correspondingly (1&thinsp;&le;&thinsp;g,&thinsp;r,&thinsp;b&thinsp;&le;&thinsp;10<sup>5</sup>).</p>

<p>The following line contains g integers x<sub>i</sub> &mdash; model numbers of the green details (0&thinsp;&le;&thinsp;x<sub>i</sub>&thinsp;&le;&thinsp;10<sup>9</sup>).</p>

<p>The following line contains r integers y<sub>i</sub> &mdash; model numbers of the red details (0&thinsp;&le;&thinsp;y<sub>i</sub>&thinsp;&le;&thinsp;10<sup>9</sup>).</p>

<p>The following line contains b integers z<sub>i</sub> &mdash; model numbers of the blue details (0&thinsp;&le;&thinsp;z<sub>i</sub>&thinsp;&le;&thinsp;10<sup>9</sup>).</p>

### 출력

<p>Print one integer &mdash; the number of ways to create the magic weapon.</p>