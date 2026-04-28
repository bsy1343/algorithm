# [Bronze III] Ant Entrapment - 9298

[문제 링크](https://www.acmicpc.net/problem/9298)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 1099, 정답: 604, 맞힌 사람: 466, 정답 비율: 53.196%

### 분류

수학, 기하학

### 문제 설명

<p>Recently, your friend Oscar purchased an ant farm. He accidentally let the ants loose on his floor and now they&rsquo;re crawling everywhere! You want to fence them off with a single continuous rectangle so that they&rsquo;re not running amok. However, due to technical limitations your fence pieces must be aligned with the X and Y axes. The figure below shows an example of a fence around a set of ants (slight offsets from the border are just for visual effect).</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/9298.%E2%80%85Ant%E2%80%85Entrapment/61c2d3fb.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/9298.%E2%80%85Ant%E2%80%85Entrapment/61c2d3fb.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9298/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:212px; width:304px" /></p>

<p>What is the perimeter and area of the smallest fence that contains all of the ants?</p>

### 입력

<p>The first line of input is the number of test cases that follow. Each test case starts with an integer N (1 &le; N &le; 100) on a line by itself representing the number of ants. The following N lines of input contain two floating-point values X and Y (&minus;1000.0 &le; X, Y &le; 1000.0) representing the position of an ant. You can assume that ants are single points&ndash;they have no area.</p>

### 출력

<p>For each case output the line &ldquo;Case x:&rdquo; where x is the case number, on a single line, followed by the string &ldquo;Area&rdquo; and the area of the fence as a floating-point value and then a comma, followed by a space and then &ldquo;Perimeter&rdquo; and the perimeter of the fence as a floating-point value. Floating-point value&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-9</sup>&nbsp;of the correct answer.</p>