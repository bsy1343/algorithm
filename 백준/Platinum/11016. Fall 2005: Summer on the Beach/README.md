# [Platinum III] Fall 2005: Summer on the Beach - 11016

[문제 링크](https://www.acmicpc.net/problem/11016)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 9, 정답: 5, 맞힌 사람: 5, 정답 비율: 55.556%

### 분류

미적분학, 기하학, 3차원 기하학, 수학

### 문제 설명

<p>In Fall of 2005, the contest explored a &ldquo;Summer on the Beach&rdquo;. One of the most important activities on the beach is lying on the sand and sun bathing. As you are all aware, prolonged exposure to sun can cause painful sunburns, so the use of sunscreen is highly recommended. Another approach pursued by many people is to lie under a parasol, protecting them from rays. But if you know from when to when you will lie at the beach, where should you place the parasol to protect as much of your body as possible?<sup>2</sup></p>

<p>Here, we will answer a slightly easier question. Given the position of your body and the parasol, calculate which percentage of your body is exposed to the sun for at least part of the time. For simplicity, we will treat your body as rectangular, of size h &times; w centimeters. We treat the beach as a two-dimensional plane, with the origin at the center of your body. The parasol is assumed to be a circle of radius r, mounted horizontally at distance d above your body, with the center at the origin as well. You are sunbathing for a period from &alpha;1 to &alpha;2, where 1<sup>◦</sup> &le; &alpha;1 &lt; &alpha;2 &le; 179<sup>◦</sup> are the angle that the sun makes with the beach at the beginning and end of your sunbath. (Assume that the sun is a point infinitely far away from the Earth, and travels straight from the left to the right.)</p>

<p><sup>2</sup>In a French student science competition, one winning entry was a &ldquo;para-tournesol&rdquo;, a &ldquo;sunflower parasol&rdquo;. Using a light sensor, the parasol moves as the sun does, protecting you as much as possible. We won&rsquo;t explore that avenue here.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>Each data set consists of a single line, containing (in this order) the real numbers w, h, r, d, &alpha;1, &alpha;2. We will always guarantee that 0.01 &le; w, h, r, d &le; 100.</p>

<p>Here is a figure illustrating these quantities. Notice that the sun travels &ldquo;from your feet to your head&rdquo;, and not &ldquo;from your left arm to your right arm&rdquo;.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11016.%E2%80%85Fall%E2%80%852005%3A%E2%80%85Summer%E2%80%85on%E2%80%85the%E2%80%85Beach/df3b0bc9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11016.%E2%80%85Fall%E2%80%852005%3A%E2%80%85Summer%E2%80%85on%E2%80%85the%E2%80%85Beach/df3b0bc9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11016/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:205px; width:405px" /></p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the percentage of your body that will be exposed to sun rays at some time, rounding to two decimals.</p>

<p>Each data set should be followed by a blank line.</p>