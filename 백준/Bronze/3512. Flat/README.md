# [Bronze III] Flat - 3512

[문제 링크](https://www.acmicpc.net/problem/3512)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 975, 정답: 634, 맞힌 사람: 572, 정답 비율: 65.672%

### 분류

수학, 구현, 문자열, 사칙연산

### 문제 설명

<p>You are one of the developers of software for a real estate agency. One of the functions you are to implement is calculating different kinds of statistics for flats the agency is selling. Each flat consists of different types of rooms: bedroom, bathroom, kitchen, balcony and others.</p>

<p>The cost of the flat is equal to the product of reduced total area and the cost of one square metre. Reduced total area is the total area of all rooms except for balconies plus one half of balconies total area.</p>

<p>You will be given some information about the area of each room in the flat and the cost of one square metre. You are to calculate the following values for the flat:</p>

<ul>
	<li>the total area of all rooms;</li>
	<li>the total area of all bedrooms;</li>
	<li>the cost of the flat.</li>
</ul>

### 입력

<p>The first line of the input file contains two integer numbers n (1 &le; n &le; 10) and c (1 &le; c &le; 100 000) &mdash; number of rooms in the flat and the cost of one square metre, respectively.</p>

<p>Each of the following n lines contains an integer number a<sub>i</sub> (1 &le; ai &le; 100) and a word t<sub>i</sub> &mdash; the area of i-th room and its type, respectively. Word t<sub>i</sub> is one of the following: &ldquo;bedroom&rdquo;, &ldquo;bathroom&rdquo;, &ldquo;kitchen&rdquo;, &ldquo;balcony&rdquo;, &ldquo;other&rdquo;.</p>

### 출력

<p>The first line of the output file should contain one integer number &mdash; the total area of all rooms of the flat. The second line of the output file should contain one integer number &mdash; the total area of bedrooms of the flat. The third line of the output file should contain one real number &mdash; the cost of the flat with precision not worse than 10<sup>&minus;6</sup>.</p>

### 힌트

<p>The figure shows the flat from the first example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/3512.%E2%80%85Flat/279c2c21.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/3512.%E2%80%85Flat/279c2c21.png" data-original-src="https://upload.acmicpc.net/86c64b4c-5556-4e3c-826d-ac4941d8e379/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 438px; height: 86px;" /></p>