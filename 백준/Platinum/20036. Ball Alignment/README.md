# [Platinum I] Ball Alignment - 20036

[문제 링크](https://www.acmicpc.net/problem/20036)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 480, 정답: 107, 맞힌 사람: 86, 정답 비율: 26.791%

### 분류

다이나믹 프로그래밍, 정렬, 이분 탐색, 값 / 좌표 압축

### 문제 설명

<p>Balls are placed on a curved structure as shown in Figure A.1, and each ball has a number written on it. Due to the law of gravity, all balls naturally gather near the lowest spot of the structure. The permitted action to change the position of the balls is to &ldquo;pick a ball, lift it up, and place it on the far left or on the far right&rdquo;. This action will naturally change the location of some balls due to the law of gravity.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20036.%E2%80%85Ball%E2%80%85Alignment/8d85e2c3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20036.%E2%80%85Ball%E2%80%85Alignment/8d85e2c3.png" data-original-src="https://upload.acmicpc.net/c79fce05-4ed4-47c1-859c-ae4141065a8b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 427px; height: 88px;" /></p>

<p style="text-align: center;">Figure A.1</p>

<p>Figure A.2 shows how the locations of the balls change when the marked ball 5 was picked up in Figure A.1 and placed on the far right.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20036.%E2%80%85Ball%E2%80%85Alignment/02dabbad.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20036.%E2%80%85Ball%E2%80%85Alignment/02dabbad.png" data-original-src="https://upload.acmicpc.net/570aa792-039d-4467-9d77-384d14024dcf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 409px; height: 92px;" /></p>

<p style="text-align: center;">Figure A.2</p>

<p>When <em>n</em> balls are arranged on a curved structure we want to sort the numbers written on the balls in non- decreasing order by repeating the permitted actions. In Figure A.2, if ball 7 is picked up and placed on the far right and ball 2 far left, all the numbers on balls are sorted in non-decreasing order.</p>

<p>Given an arrangement of <em>n</em> balls, write a program which helps to rearrange all the numbers written on the balls in non-decreasing order by selecting minimum number of balls and relocating them through the permitted actions.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing an integer <em>n</em> (1 &le; <em>n</em> &le; 10<sup>5</sup>), which denotes the number of balls. Each of the following <em>n</em> lines contains an integer <em>v</em> (1 &le; <em>v</em> &le; 10<sup>9</sup>), which is the number written on a ball. Notice that some balls may have the same number written on them.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain the minimum number of balls picked up and relocated to align all the numbers written on the <em>n</em> balls in non-decreasing order.</p>