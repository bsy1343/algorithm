# [Gold III] Research Productivity Index - 17591

[문제 링크](https://www.acmicpc.net/problem/17591)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 38, 맞힌 사람: 36, 정답 비율: 85.714%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Angela is a new PhD student and she is nervous about the upcoming paper submission deadline of this year&rsquo;s research conference. She has been working on multiple projects throughout the past year. Luckily most of the projects concluded successfully, and she came up with <em>n</em> candidate papers. However not all of the papers were born equal&mdash;some have better results than others. Her advisor believes she should only submit the papers with &ldquo;good enough&rdquo; results so they have a high chance of getting accepted.</p>

<p>Angela&rsquo;s research group has a unique way of evaluating the success of paper submissions. They use the research productivity index, defined as <em>a<sup>a</sup></em><sup>/<em>s</em></sup>, where <em>s</em> is the total number of papers submitted, and <em>a</em> is the number of papers that are accepted by the conference. When <em>a</em> = 0, the index is defined to be zero. For example:</p>

<ul>
	<li>if one paper is submitted and it gets accepted, the index is 1<sup>1/1</sup> = 1;</li>
	<li>if 4 papers are submitted and all get accepted, the index is 4<sup>4/4</sup> = 4;</li>
	<li>if 10 papers are submitted and 3 get accepted, the index is 3<sup>3/10</sup> &asymp; 1.390389;</li>
	<li>if 5 papers are submitted and 4 get accepted, the index is 4<sup>4/5</sup> &asymp; 3.031433;</li>
	<li>if 3 papers are submitted and all get rejected (<em>a</em> = 0), the index is 0.</li>
</ul>

<p>Intuitively, to get a high research productivity index one wants to get as many papers accepted as possible while keeping the acceptance rate high.</p>

<p>For each of her <em>n</em> papers, Angela knows exactly how likely it is that the conference would accept the paper. If she chooses wisely which papers to submit, what is the maximum expected value of her research productivity index?</p>

### 입력

<p>The first line of the input has a single integer <em>n</em> (1 &le; <em>n</em> &le; 100), the number of Angela&rsquo;s candidate papers. The next line has <em>n</em> space-separated integers giving the probability of each paper getting accepted. Each probability value is given as an integer percentage between 1 and 100, inclusive.</p>

### 출력

<p>Output the maximum expected value of Angela&rsquo;s research productivity index. Your answer is considered correct if it has an absolute or relative error of no more than 10<sup>&minus;6</sup>.</p>