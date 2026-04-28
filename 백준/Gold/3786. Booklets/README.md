# [Gold V] Booklets - 3786

[문제 링크](https://www.acmicpc.net/problem/3786)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 10, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

수학, 구현, 정렬, 사칙연산

### 문제 설명

<p>Bob has a difficult job. He must distribute advertising booklets for extra school activities in different schools. The booklets have different number of pages. Bob has a list with the number of pages of each booklet and the number of schools that he must visit. He has to distribute the booklets such that each school gets a number of booklets equal to either the lower integer part (LIP), or the upper integer part (UIP) of the number of booklets divided by the number of schools. Poor Bob must obey other rules too. He must distribute all the UIP number of booklets first and then the LIP number of booklets. Any bookflet A that is distributed to a school S_i must have fewer or at most an equal number of pages that any other booklet B that is distributed to a school S_j, if S_i gets the booklets before S_j (i.e if i &lt; j then pages(A) &lt;= pages(B)). When Bob distributes the booklets to a school he must distribute them in the same relative order in which they are on his list. Moreover, he must distribute them very fast. When he comes back to the advertising company his boss verifies if he accomplished well his task, by asking him the number of pages of the first booklet distributed to a specific school, following the order in which Bob visited the schools (starting with 0). Difficult job, isn&#39;t it? Can you help him?</p>

### 입력

<p>Each data set in the file stands for a particular set of bookets. For each set of booklets the input contains the number of schools, the school specified by Bob&#39;s boss, the number of booklets (less than 3000), the number of pages of each booklet (fits in integer). White spaces can occur freely between the numbers in the input. The input data are correct.</p>

### 출력

<p>For each set of data the program prints the result to the standard output on a separate line. The solution is represented by the number of pages of the first booklet distributed to the specified school.</p>