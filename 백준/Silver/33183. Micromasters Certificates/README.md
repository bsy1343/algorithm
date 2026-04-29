# [Silver II] Micromasters Certificates - 33183

[문제 링크](https://www.acmicpc.net/problem/33183)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 18, 정답 비율: 72.000%

### 분류

구현, 문자열, 브루트포스 알고리즘, 자료 구조, 집합과 맵, 파싱, 해시를 사용한 집합과 맵

### 문제 설명

<p>The Department of Computer Engineering has provided several micromasters, each containing a curriculum. If a student successfully completes all the courses of a micromaster, he will receive the certificate of that micromaster. A course may be included in the curriculum of several micromasters. Soroush, who only thinks about getting a certificate and doesn’t care about the type of certificate, wants to get $3$ micromasters certificates by taking the minimum possible number of courses. The micromasters curriculums are posted on the bulletin board. Help Soroush reach his goal according to the micromasters curriculums.</p>

### 입력

<p>The input represents a bulletin board. The board consists of at most $400$ rows and $400$ columns. Each micromasters curriculum is encapsulated in a rectangular box. The boundaries of the bulletin board and the curriculum boxes are represented by characters “<code>+</code>”, “<code>-</code>”, and “<code>|</code>” for corners, horizontal sides, and vertical sides, respectively. The curriculum boxes are disjoint (with no characters in common) and each has its own boundary. Each line inside a curriculum box contains at most one course name. Course names consist of alphanumeric and space characters. Course names are not case-sensitive, and spaces do not matter in them. For example, “<code>General math1</code>” and “<code>generalMath 1</code>” are the same. There are at most $50$ curriculum boxes and each box contains at most $30$ courses. It is guaranteed that there are at least $3$ boxes on the board and there is at least $1$ course in each box.</p>

### 출력

<p>Print a single line containing the minimum number of courses that should be taken by Soroush to get at least $3$ certificates.</p>