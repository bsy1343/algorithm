# [Gold III] Lozinke - 14965

[문제 링크](https://www.acmicpc.net/problem/14965)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 112, 정답: 69, 맞힌 사람: 53, 정답 비율: 63.095%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Recently, there has been a breach of user information from the mega-popular social network Secret Network. Among the confidential information are the passwords of all users.</p>

<p>Mihael, a young student who has been exploring computer security lately, found the whole thing really interesting. While experimenting with the social network, he found another security breach! When you input any string of characters that contains a substring equal to the actual password, the login will be successful. For example, if the user whose password is abc inputs one of the strings abc, abcd or imaabcnema, the system will successfully log him in, whereas the login will fail for axbc.</p>

<p>Mihael wants to know how many ordered pairs of different users exist such that the first user, using their own password, can login as the second user.</p>

### 입력

<p>The first line of input contains the positive integer N (1 &le; N &le; 20 000), the number of users. Each of the following N lines contains the user passwords. The passwords consist of at least one and at most 10 lowercase letters of the English alphabet.</p>

### 출력

<p>The first and only line of output must contains the number of ordered pairs from the task.</p>

### 힌트

<p>Clarification​ ​of​ ​the​ ​second​ ​test​ ​case:</p>

<p>The first user can login as the second user, the second user can login as the first, and the third user can login as both the first and the second user.</p>