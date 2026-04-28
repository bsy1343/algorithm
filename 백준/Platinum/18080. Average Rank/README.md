# [Platinum I] Average Rank - 18080

[문제 링크](https://www.acmicpc.net/problem/18080)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 99, 정답: 53, 맞힌 사람: 44, 정답 비율: 69.841%

### 분류

누적 합

### 문제 설명

<p>The National Weekly Escape Room Challenge (NWERC) is a long-running competition held in Eindhoven. Every week a new escape room is presented, and anyone who completes it in their first attempt gains one point.</p>

<p>At the end of each week, competitors are ranked by the total number of points accumulated so far, highest first. In case of a tie, they share the same rank. In other words, the rank of a competitor is one more than the number of people with a strictly larger number of points.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18080.%E2%80%85Average%E2%80%85Rank/db920b87.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18080.%E2%80%85Average%E2%80%85Rank/db920b87.png" data-original-src="https://upload.acmicpc.net/f8f8a5c8-ac73-4cfb-b506-64de02b6c8f1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 607px; height: 127px;" /></p>

<p style="text-align: center;">Figure A.1: Illustration of Sample Input 3.</p>

<p>In total there have been n participants in the contest, and the contest has been going for w weeks. For each week you are given a list of the competitors that gained a point that week. Your task is to calculate the average rank during the w-week competition for each competitor.</p>

<p>Figure A.1 illustrates the score progression in the third sample.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers n and w (1 &le; n, w &le; 3 &middot; 10<sup>5</sup>), the number of competitors and the number of weeks. The competitors are numbered from 1 to n.</li>
	<li>w lines (one for each week), each containing an integer k (0 &le; k &le; n) followed by k distinct integers c<sub>1</sub>, . . . , c<sub>k</sub> (1 &le; c<sub>i</sub> &le; n for all i), indicating that the k competitors c<sub>1</sub>, . . . , c<sub>k</sub> each gained a point that week.</li>
</ul>

<p>The total number of points awarded is at most 1 million.</p>

### 출력

<p>Output n lines, the ith of which contains the average rank of the ith competitor during the w-week competition. Your answers should have an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>