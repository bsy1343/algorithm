# [Silver V] File names - 21890

[문제 링크](https://www.acmicpc.net/problem/21890)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 159, 정답: 104, 맞힌 사람: 93, 정답 비율: 65.957%

### 분류

많은 조건 분기, 구현, 문자열

### 문제 설명

<p>Petya and Vasya love to develop their own operating systems, so Petya uses PetOS operating system on his computer, and Vasya uses VasOS on his computer.</p>

<p>One day Petya wanted to send Vasya some files from his computer, but it turned out that it was not so easy to do. The problem is that in PetOS the name of file can be any string consisting of Latin letters and dots, with length in range from 1 to 20, and VasOS only supports the names of the form <code>&lt;filename&gt;.&lt;extension&gt;</code>, where <code>&lt;filename&gt;</code> and <code>&lt;extension&gt;</code> are non-empty strings of Latin letters, with the length of <code>&lt;filename&gt;</code> not greater than 8, and the length of <code>&lt;extension&gt;</code> not greater than 3.</p>

<p>Help Petya to calculate how many files from his list can be transferred to Vasya without changing their name.</p>

### 입력

<p>The first line contains the number $n$, the number of files Petya wants to transfer ($1 \le n \le 100$). The following $n$ lines contain file names. All names have a length of 1 to 20 characters and contain only lowercase Latin letters and dots.</p>

### 출력

<p>Output the number of files that Petya can transfer to Vasya without renaming.</p>

### 힌트

<p>In the given example Petya can transfer the following files: <code>a.t</code>, <code>con.exe</code>, <code>solution.cpp</code>.</p>