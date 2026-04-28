# [Gold IV] Barbells - 13751

[문제 링크](https://www.acmicpc.net/problem/13751)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 202, 정답: 128, 맞힌 사람: 104, 정답 비율: 60.819%

### 분류

브루트포스 알고리즘, 비트마스킹, 백트래킹

### 문제 설명

<p>Your local gym has b bars and p plates for barbells. In order to prepare a weight for lifting, you must choose a single bar, which has two sides. You then load each side with a (possibly empty) set of plates. For safety reasons, the plates on each side must balance; they must sum to the same weight. The combination of plates on either side might be different, but the total weight on either side must be the same. What weights are available for lifting?</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13751.%E2%80%85Barbells/0fd354ca.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13751/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-19%20%EC%98%A4%EC%A0%84%202.13.57.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:141px; width:360px" /></p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. The first line of input contains two integers, b and p (1 &le; b,p &le; 14), representing the number of bars and plates. Then, there are b lines each containing a single integer x (1 &le; x &le; 10<sup>8</sup> ) which are the weights of the bars. After that, there are p lines each containing a single integer y (1 &le; y &le; 10<sup>8</sup> ) which are the weights of the plates.&nbsp;</p>

### 출력

<p>Output a sorted list of all possible lifting weights, one per line. There must be no duplicates.</p>