# [Gold II] Code Word - 17567

[문제 링크](https://www.acmicpc.net/problem/17567)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 38, 맞힌 사람: 36, 정답 비율: 85.714%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Following on from the engineering success of Left Pad, Ltd, Lynn started a new venture: Internet of Security, Inc. The company&rsquo;s flagship product will be a device for entering passcodes.</p>

<p>The chief innovation of this device will be in its ability to reject attempts to set insecure passwords. An insecure passcode is defined as a sequence of digit presses such that at least two consecutive presses are either directly or diagonally adjacent.</p>

<p>Lynn, ever-vigilant for the future, is worried that this system might not allow enough unique passcodes to support a large company with trillions of employees. For a given digit pad grid size, and fixed length of password, calculate the number of allowed passwords.</p>

<p>Since the number might be very large in some cases, output your answer mod 1 000 000 007.</p>

### 입력

<ul>
	<li>The first line contains the integers r and c (1 &le; r, c &le; 100), the number of rows and columns of buttons on the pad.</li>
	<li>The second line contains the integer l (1 &le; l &le; 200), the single allowed length for any passcode.</li>
</ul>

### 출력

<p>Output the number of legal passcodes, mod 1 000 000 007.</p>