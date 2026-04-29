# [Silver I] Eli's Curious Mind - 15834

[문제 링크](https://www.acmicpc.net/problem/15834)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 83, 정답: 57, 맞힌 사람: 52, 정답 비율: 71.233%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Eli is a teenager who loves to study chemistry. She recently joined a chemistry research lab. Dr. Phil wants her to just play around with some chemicals and observe their reaction. Therefore, he gave her a one-row tray of test tubes with the different chemical inside of them and told her:</p>

<p>&quot;Mix these chemical together anyhow that you like, but the you have to follow two rules:</p>

<ol>
	<li>Never make a mixture that has two chemicals that their tubes are next to each other.</li>
	<li>Keep adding more chmical to the mixture until it is not violating the new rule. &quot;</li>
</ol>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15834.%E2%80%85Eli's%E2%80%85Curious%E2%80%85Mind/4875c0c0.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/15834.%E2%80%85Eli's%E2%80%85Curious%E2%80%85Mind/eb5d92d0.png" data-original-src="https://boja.mercury.kr/assets/problem/15834-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 167px; float: right;" />For example, in the image you can see she was given 5 tubes and she is able to make 4 different mixture without violating the rule: {1,3,5}, {2,4}, {2,5}, {1,4}.</p>

<p>But she cannot mix 1 and 3 only because she still can add 5 without violating the rules.</p>

<p>She is curious to know how many different mixtures she can make without violating the rule with any given number of tubes. That&#39;s why she asks you write a code to calculate it for her.</p>

### 입력

<p>The input will consist of a sequence of numbers N, 1 &le; N&nbsp;&le; 76. Each number will be on a separate line. The input will be terminated by 0.</p>

### 출력

<p>Output the number of different mixture she can make without violating the rule mentioned above on a single line as show in the sample. The number of all subsets will be less than 2<sup>31</sup>.</p>