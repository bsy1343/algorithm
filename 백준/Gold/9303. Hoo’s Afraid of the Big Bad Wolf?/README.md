# [Gold III] Hoo’s Afraid of the Big Bad Wolf? - 9303

[문제 링크](https://www.acmicpc.net/problem/9303)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 78, 정답: 36, 맞힌 사람: 30, 정답 비율: 41.667%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 플로이드–워셜

### 문제 설명

<p>Little Red Riding Hood is walking to visit her Grandmother&rsquo;s house. Thankfully, Little Red Riding Hood is an avid reader of the Bid Bad Wolf&rsquo;s blog, which details the paths he and his friends are guarding. The Big Bad Wolf is no technological slouch, and knows the importance of keeping information private; thus his blog only states the likelihood that a path won&rsquo;t be guarded by a wolf. Should Little Red Riding Hood take a path that a wolf is guarding, she will be devoured, which is never a good thing. Paths through the forest are one-directional, and Little Red Riding Hood may not go backwards along a path. What route should Little Red Riding Hood take to maximize the chance of making it to Grandmother&rsquo;s?</p>

<p>Below is a diagram representing the first test case.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9303.%E2%80%85Hoo%E2%80%99s%E2%80%85Afraid%E2%80%85of%E2%80%85the%E2%80%85Big%E2%80%85Bad%E2%80%85Wolf%3F/6d6ed4e2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9303/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:310px; width:622px" /></p>

### 입력

<p>The first line of input is the number of test cases that follow. Each test case starts with an integer N (1 &le; N &le; 100) on a line by itself representing the number of intersections. Then there will be a single line with two integers, X and Y (1 &le; X, Y &le; N), separated by a single space, indicating the numbers of the start (X) and end (Y ) intersections. There will always be a path from the starting intersection to the ending intersection. Then the input will contain a single line with an integer M (0 &le; M &le; 5000), indicating the number of directed paths. M lines will follow, each containing three values separated by spaces: the start intersection A, the end intersection B, and the likelihood represented as a floating point number (0.000 &lt; P &le; 1.000) that a path is safe&ndash;there is no wolf on that path. There can be multiple paths between the same two intersections. The floating point number&nbsp;is consist of decimal digits and at most three decimal points.</p>

### 출력

<p>For each case output &ldquo;Case x:&rdquo; where x is the case number, on a single line, followed by the chance that Little Red Riding Hood makes it to Grandmother&rsquo;s house if she takes the safest path, with an absolute or relative error of at most 10<sup>&minus;3</sup>.</p>