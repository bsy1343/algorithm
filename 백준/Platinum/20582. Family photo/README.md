# [Platinum II] Family photo - 20582

[문제 링크](https://www.acmicpc.net/problem/20582)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 17, 맞힌 사람: 17, 정답 비율: 60.714%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>Bitian family is just having a family gathering. Family members are numbered with consecutive numbers from $1$ to $n$. Bityslav is the oldest family member and number $1$ was associated to him. Each of the remaining family members has exactly one parent (kinda weird, but let it be).</p>

<p>Such wonderful family gathering needs to be documented well and there needs to be a photo taken. This photo will depict some of family members arranged in a row. However, this year family members are very choosy. Two members agree to stand next to each other if and only if one of them is an ancestor of the second one (not necessarily an immediate one). We say that A is an ancestor of B if and only if A is either a parent of B or a parent of some of B&#39;s ancestors}</p>

<p>Bityslav has a hard task now as he would like as many family members on this photo as possible. What is the biggest number of people that can be present on it?</p>

### 입력

<p>The first line of input contains one integer $n$ ($2 \le n \le 300\,000$) denoting number of Bitian family members. The second line contains $n-1$ integers $p_2, p_3, \ldots, p_n$ ($1 \le p_i \le n$, $p_i \ne i$ for $2 \le i \le n$), where $p_i$ is an index of a parent of $i$-th family member. You can assume that there is no cycle in this genealogical tree, i.e. nobody is an ancestor of himself.</p>

### 출력

<p>You should output one integer which is the maximum possible number of family members present on a photo with respect to constraints set by family members.</p>

### 힌트

<p>Following picture denotes genealogical tree of Bitian family. One of the optimal photos can contain members with numbers $7$, $6$, $8$, $1$, $2$, $5$, $3$ in this order. It can be shown it is impossible to have all of them on one photo.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20582.%E2%80%85Family%E2%80%85photo/a87e2602.png" data-original-src="https://upload.acmicpc.net/42e267b5-cf28-4e4a-8b53-64d2ce014f6d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 198px;" /></p>

<p>&nbsp;</p>