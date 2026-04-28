# [Gold III] Intrepid climber - 10403

[문제 링크](https://www.acmicpc.net/problem/10403)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 144, 정답: 55, 맞힌 사람: 45, 정답 비율: 44.118%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Who would guess? You climbed the highest mountain of your city. You are so excited about it that you need to tell it to all your friends, and you decided to start with those that are trying to be exactly where you are at this precise moment.</p>

<p>The mountain has N landmarks, and one of them is the top of the mountain, where you are now. Each of your friends that is climbing the mountain is in some other landmark, and you want to visit all of them. There are tracks that connect pairs of landmarks in such a way that there exists exactly one route (that is, a sequence of consecutive tracks) that goes down from the top of the mountain to each other landmark. To visit two friends in two different landmarks, you may have to go down some tracks, climb others, and go down others again. Going down the mountain is &ldquo;easy&rdquo;, so you do not consume energy when you go down through the tracks. But each time you climb a track, you consume a certain amount of energy. After visiting all your friends, you can just sit and rest.</p>

<p>For example, consider the mountain in the picture below, which has N = 6 landmarks. If your friends are in landmarks 5 and 2, you can visit both if you follow the sequence of landmarks 1 &darr; 2 &uarr; 1 &darr; 3 &darr; 5, where a &darr; b means that you go down a track from landmark a to landmark b, and a &uarr; b means that you climb a track from landmark a to landmark b. Another possible sequence is 1 &darr; 3 &darr; 5 &uarr; 3 &uarr; 1 &darr; 2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10403.%E2%80%85Intrepid%E2%80%85climber/33b40253.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10403.%E2%80%85Intrepid%E2%80%85climber/33b40253.png" data-original-src="https://www.acmicpc.net/upload/images2/intrepid.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:158px; width:166px" /></p>

<p>Given the tracks between the landmarks, the energy required to climb them, and the landmarks where your friends are, compute the minimum total amount of energy required to visit all your friends from the top of the mountain.</p>

### 입력

<p>The first line contains two integers N and F (1 &le; F &lt; N &le; 10<sup>5</sup>), representing respectively the number of landmarks and the number of your friends that are climbing the mountain. Landmarks are identified with distinct integers from 1 to N, being 1 the top of the mountain, where you initially are. Each of the next N &minus; 1 lines describes a different track with three integers A, B and C, indicating that there is a track from A to B that goes down and requires an amount C of energy to be climbed (1 &le; A &le; N, 2 &le; B &le; N, A &ne; B and 1 &le; C &le; 100). The next line contains F different integers L<sub>1</sub>, L<sub>2</sub>, . . . , L<sub>F</sub> (2 &le; L<sub>i</sub> &le; N for i = 1, 2, . . . , F) representing the landmarks where your friends are. You may assume that the tracks between landmarks are such that there exists exactly one route that goes down from the top of the mountain to each other landmark.</p>

### 출력

<p>Output a line with an integer representing the minimum total amount of energy required to visit all your friends starting from the top of the mountain.</p>