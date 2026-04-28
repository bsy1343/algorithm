# [Platinum II] Reach for the Stars - 25939

[문제 링크](https://www.acmicpc.net/problem/25939)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>When you were a little kid, you would stamp papers randomly but your parents were still so impressed by your art. Now you are dealing with the UCF Programming Team Coaches and you need to be more creative to impress them. Good luck!</p>

<p>You are given a star shaped stamp like the one below. The black area is covered in ink and the white area is not. When the stamp hits the paper, it leaves a mark for each cell of ink that hits the paper.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/727f70ff-47ab-4523-9322-4c0b3a12401a/-/preview/" style="width: 129px; height: 131px;" /></p>

<p>For example, the image below can be made with two stampings. Notice the stamp must always remain axis-aligned when hitting the paper. We also require that the stamp be completely contained within the paper. Note a cell of paper stamped once with black ink is indistinguishable from a cell of paper stamped multiple times with black ink. Note also that cells and stamp line up properly, i.e., a cell is either covered completely by the stamp or not covered at all, i.e., the stamp will not cover part of a cell.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3b226190-4cc9-4df0-ac87-b8797f02f1ad/-/preview/" style="width: 237px; height: 147px;" /></p>

<p>Given a black and white image, determine the minimum number of times, if possible, you would need to stamp the paper with the star stamp to end up with the design specified.</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of images to evaluate. Each image starts with a line containing two integers, r and c, (1 &le; r &le; 9, 1 &le; c &le; 9), representing the number of rows and columns, respectively. The next r input lines contains c characters each. The characters are either &lsquo;.&rsquo;, representing a blank cell of the image and &lsquo;#&rsquo;, representing a cell of the image covered in ink.</p>

### 출력

<p>For each image, output &ldquo;Image #d: v&rdquo; where v is the minimum number of stampings required to make the image. Replace v with &ldquo;impossible&rdquo; (without quotes) if it is not possible to form the image using the star shaped stamp. Leave a blank line after the output for each test case.</p>