# [Platinum V] Grandpa’s Rubik Cube - 5781

[문제 링크](https://www.acmicpc.net/problem/5781)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 86, 정답: 62, 맞힌 사람: 47, 정답 비율: 73.438%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A very well-known toy/pastime, called Rubik&#39;s cube, consists of a cube as shown in Figure 1a, where letters stand for colors (e.g. B for blue, R for red,...). The goal of the game is to rotate the faces of the cube in such a way that at the end each face has a different color, as shown in Figure 1b. Notice that,</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5781.%E2%80%85Grandpa%E2%80%99s%E2%80%85Rubik%E2%80%85Cube/98dd0f9f.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/5781/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.02.17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:193px; width:357px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5781.%E2%80%85Grandpa%E2%80%99s%E2%80%85Rubik%E2%80%85Cube/98dd0f9f.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/5781/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.02.17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:193px; width:357px" /></p>

<p>Figure 1: Rubik Cube</p>

<p>when a face is rotated, the configuration of colors in all the adjacent faces changes. Figure 2 illustrates a rotation of one of the faces. Given a scrambled configuration, reaching the final position can be quite challenging, as you may know.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5781.%E2%80%85Grandpa%E2%80%99s%E2%80%85Rubik%E2%80%85Cube/151bc86e.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/5781/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.02.56.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:178px; width:542px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5781.%E2%80%85Grandpa%E2%80%99s%E2%80%85Rubik%E2%80%85Cube/151bc86e.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/5781/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.02.56.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:178px; width:542px" /></p>

<p>Figure 2: Rotation example</p>

<p>But your grandpa has many years of experience, and claims that, given any configuration of the Rubik cube, he can come up with a sequence of rotations leading to a winning configuration.</p>

<p>In order to show all faces of the cube we shall represent the cube as in Figure 3a. The six colors are Yellow, Red, Blue, Green, White and Magenta (represented by their first letters).</p>

<p>You will be given an initial configuration and a list of rotations. A rotation will be represented by an integer number, indicating the face to be rotated and the direction of the rotation (a positive value means clockwise rotation, negative value means counter-clockwise rotation). Faces of the cube are numbered as shown in Figure 3b. You must write a program that checks whether the list of rotations will lead to a winning configuration.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5781.%E2%80%85Grandpa%E2%80%99s%E2%80%85Rubik%E2%80%85Cube/556b9486.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/5781/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.03.20.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:203px; width:530px" /></p>

<p>Figure 3: Representation of the cube</p>

### 입력

<p>The input contains several test cases. The first line of the input is an integer which indicates the num- ber of tests. Each test description consists of ten lines of input. The first nine lines of a test will describe an initial configuration, in the format shown in Figure 3a. The next line will contain a list of rotations, ending with the value 0.</p>

<p>&nbsp;</p>

### 출력

<p>For each test case your program should print one line. If your grandpa is correct, print &ldquo;Yes, grandpa!&rdquo;, otherwise print &ldquo;No, you are wrong!&rdquo;.</p>

<p>&nbsp;</p>