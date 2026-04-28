# [Platinum III] Unusual Darts - 13299

[문제 링크](https://www.acmicpc.net/problem/13299)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 18, 맞힌 사람: 16, 정답 비율: 69.565%

### 분류

브루트포스 알고리즘, 기하학, 수학, 확률론

### 문제 설명

<p>In the game of Unusual Darts, Alice throws seven darts onto a 2-foot by 2-foot board, and then Bob may or may not throw three darts.</p>

<p>Alice&rsquo;s seven darts define a polygon by the order in which they are thrown, with the perimeter of the polygon connecting Dart 1 to Dart 2 to Dart 3 to Dart 4 to Dart 5 to Dart 6 to Dart 7, and back to Dart 1. If the polygon so defined is not simple (meaning it intersects itself) then Alice loses. If the polygon is simple, then Bob throws three darts. He is not a very good player, so although his darts always land on the board, they land randomly on the dart board following a uniform distribution. If all three of these darts land within the interior of the polygon, Bob wins, otherwise Alice wins.</p>

<p>For this problem you are given the locations of Alice&rsquo;s darts (which form a simple polygon) and the probability that Bob wins. Your job is to determine the order in which Alice threw her darts.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13299.%E2%80%85Unusual%E2%80%85Darts/166bb728.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13299/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-30%20%EC%98%A4%ED%9B%84%207.05.52.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:177px; width:490px" /></p>

### 입력

<p>The first line of input contains an integer N (1 &le; N &le; 1 000), indicating the number of Darts games that follow. Each game description has 8 lines. Lines 1 through 7 each have a pair of real numbers with 3 digits after the decimal point. These indicate the x and y coordinates of Alice&rsquo;s seven darts (x<sub>1</sub> y<sub>1</sub> to x<sub>7</sub> y<sub>7</sub>), which are all at distinct locations. All coordinates are given in feet, in the range (0 &le; x<sub>i</sub>, y<sub>i</sub> &le; 2).&nbsp;The 8<sup>th</sup> line contains a real number p with 5 digits after the decimal point, giving the probability that Bob wins. In all test cases, Alice&rsquo;s darts do form a simple polygon, but not necessarily in the order given.</p>

### 출력

<p>For each Darts game, output the order in which the darts could have been thrown, relative to the order they were given in the input, so that Bob wins with probability p. If several answers are possible, give the one that is lexicographically least. Any ordering that would give Bob a probability of winning within 10<sup>&minus;5</sup> of the given value of p is considered a valid ordering.</p>