# [Gold IV] Magnetos - 10617

[문제 링크](https://www.acmicpc.net/problem/10617)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 24, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

그래프 이론, 오일러 경로

### 문제 설명

<p>This is year 2050 and the SETI Institute (Search for Extraterrestrial Intelligence Institute) has recently decoded an alien message from Magneto Universe. Magnetos are offering earthlings with StarGate technology that can enable us to travel faster than the speed of light hence making intergalactic travel a reality. But before handing over the technology the Magnetos want to make sure that earthlings are smart enough to be worthy of the StarGate technology. So, in their message they&#39;ve asked us to solve the following problem.</p>

<p>One component of a StarGate is a straight line that is made up of Magneto magnets. Unlike Earth&#39;s magnets, a magnet from Magneto Universe:</p>

<ul>
	<li>Has two opposite ends but each end can carry 1 out of 25 polarities.</li>
	<li>Both ends of a magnet may carry the same polarity.</li>
	<li>Identical polarities attract each other. Mismatching polarities also attract each other but will destroy the magnet on contact.</li>
</ul>

<p>The figure below shows a segment of the valid magnetic arrangement that could be part of a StarGate.&nbsp;</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10617.%E2%80%85Magnetos/2682914d.png" data-original-src="https://www.acmicpc.net/upload/images2/lahore2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:51px; width:445px" /></p>

<p>Magnetos have sent a few random configurations of magnets and are asking if the magnets can be arranged in a straight line where first and the last end of the line have the same polarity.</p>

<p>Your task is to help SETI solve this problem.</p>

### 입력

<p>The input consists of multiple test cases. The first line of input is the number of test cases N (1&le;N&le;100). The first line of each test configuration contains an integer M (1&le;M&le;1000) specifying the number of magnets in the configuration. Each of the next M lines contains two integers describing the polarities of the magnet. Polarities are represented by integers ranging from 1 to 25.</p>

### 출력

<p>For each test configuration in the input first, output &ldquo;Case #n: &rdquo; where n is the test configuration number, followed by &ldquo;Yes&rdquo; if the magnets can be arranged in the desired order and &ldquo;No&rdquo; otherwise.</p>