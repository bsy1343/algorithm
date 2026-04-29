# [Gold III] Dreamcatcher - 35075

[문제 링크](https://www.acmicpc.net/problem/35075)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 19, 맞힌 사람: 18, 정답 비율: 100.000%

### 분류

수학, 정수론

### 문제 설명

<p>Lately, you are plagued by horrifying nightmares. In those dreams, a swarm of angry Fenwick bees chases you around a tree with heavy and light branches. You hate getting stung by their fiddling bits. Therefore, you decided to build a dreamcatcher three days ago, but the process is tricky, and you cannot figure out the details.</p>

<p>Planning your dreamcatcher became so stressful that you spent the last three nights awake, thinking about long strings of yarn, Carmichael numbers, and geometry. The only progress so far is some incomprehensible drawings (see Figure D.1) and the observation that the length of a chord that spans $\theta$ degrees of a circle with radius $r$ is $2r\cdot\sin(\theta/2)$. But how is this going to help? You would rather have the dreams about Fenwick bees again than being tormented by this dreadful project for one more day. You need to solve this <em>now</em>!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35075.%E2%80%85Dreamcatcher/43482ff1.png" data-original-src="https://boja.mercury.kr/assets/problem/35075-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 188px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35075.%E2%80%85Dreamcatcher/ffcbbd14.png" data-original-src="https://boja.mercury.kr/assets/problem/35075-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 188px;"></p>

<p style="text-align: center;">Figure D.1: A dreamcatcher with $8$ notches, showing two ways of wrapping it in a string of yarn. The dreamcatcher on the left spans $2$ notches per chord, while the dreamcatcher on the right spans $3$ notches per chord.</p>

<p>To build a dreamcatcher, you take a wheel with $n$ evenly spaced notches, numbered from $1$ to $n$. You wrap a string of yarn around this wheel, spanning $k$ notches per chord: starting at notch $1$, you repeatedly connect the yarn $k$ notches ahead until you reach notch $1$ again. For example, with $n=8$ and $k=3$, you would go from notch $1$ to $4$, then $7$, $2$, $5$, $8$, $3$, $6$, $1$.</p>

<p>A dreamcatcher's effectiveness depends on the amount of used yarn. You need to choose $k$, the number of notches to span per chord, such that the total length of yarn is maximized. The answer does not depend on the radius of the dreamcatcher.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($3\leq n\leq 10^9$), the number of notches on the wheel.</li>
</ul>

### 출력

<p>Output an integer $k$ ($1\leq k &lt; n$) that maximizes the length of used yarn when spanning $k$ notches per chord.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>