# [Platinum V] SLIKAR - 2950

[문제 링크](https://www.acmicpc.net/problem/2950)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

다이나믹 프로그래밍, 재귀

### 문제 설명

<p>Josip is a strange painter. He wants to paint a picture consisting of N&times;N pixels, where N is a power of two (1, 2, 4, 8, 16 etc.). Each pixel will be either black or white. Josip already has an idea of how each pixel will be coloured.</p>

<p>This would be no problem if Josip&#39;s painting process wasn&#39;t strange. He uses the following recursive process:</p>

<ul>
	<li>If the picture is a single pixel, he colours it the way he intended.</li>
	<li>Otherwise, split the square into four smaller squares and then:
	<ol>
		<li>Select one of the four squares and colour it white.</li>
		<li>Select one of the three remaining squares and colour it black.</li>
		<li>Consider the two remaining squares as new paintings and use the same three-step process on them.</li>
	</ol>
	</li>
</ul>

<p>Soon he noticed that it was not possible to convert all his visions to paintings with this process. Your task is to write a program that will paint a picture that differs as little as possible from the desired picture. The difference between two pictures is the number of pairs of pixels in corresponding positions that differ in colour.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 512), the size of the picture Josip would like to paint. N will be a power of 2.</p>

<p>Each of the following N lines contains N digits 0 or 1, white and black squares in the target picture.</p>

### 출력

<p>On the first line, output the smallest possible difference that can be achieved.</p>

<p>On the next N lines, output a picture that can be painted with Josip&#39;s process and achieves the smallest difference. The picture should be in the same format as in the input.</p>

<p>Note: The second part of the output (the picture) may not be unique. Any correct output will be accepted.</p>