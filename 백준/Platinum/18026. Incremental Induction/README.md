# [Platinum II] Incremental Induction - 18026

[문제 링크](https://www.acmicpc.net/problem/18026)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 33, 맞힌 사람: 31, 정답 비율: 88.571%

### 분류

그래프 이론, 그리디 알고리즘, 애드 혹

### 문제 설명

<p>The Nordic Collegiate Pong Championship (NCPC) is an insanely competive tournament where every contestant plays exactly one game of Pong against every other contestant. The last game of the tournament just finished, so only one item now remains on the programme: the traditional diploma ceremony, where all this year&rsquo;s participants get inducted into the NCPC Hall of Fame.</p>

<p>According to the ancient customs, contestants who have not been inducted into the Hall of Fame yet (the pathetic nobodies) must stay on the left side of the stage, whereas contestants who have been inducted (the awesome legends) must be on the right side of the stage. Then, when a contestant is receiving their diploma, they will symbolically walk from the left to the right side of the stage and thus become an awesome legend. Only one contestant is inducted into the Hall of Fame at a time, and every contestant starts on the left side initially.</p>

<p>The NCPC Head of Jury believes it reflects badly on her if too many of the awesome legends on the right have lost matches against pathetic nobodies on the left, but she quickly realizes that it might be impossible to avoid this at every point in time during the diploma ceremony. However, she certainly wants to keep such atrocities at a minimum. Specifically, she wants to find the smallest number k for which there exists an order of handing out diplomas to the contestants, such that at no point there were more than k games played where an awesome legend lost against a pathetic nobody.</p>

### 입력

<p>The first line of input contains a single integer n (1 &le; n &le; 5 000), the number of contestants. Then follows n&minus;1 lines, the i<sup>th</sup> of which contains a binary string of length i. The j<sup>th</sup> character on the i<sup>th</sup> line is 1 if contestant i + 1 defeated contestant j, and 0 if contestant j defeated contestant i + 1.</p>

### 출력

<p>Output a single integer k, the smallest number according to the requirements above.</p>