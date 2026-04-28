# [Bronze IV] Counting Clauses - 17903

[문제 링크](https://www.acmicpc.net/problem/17903)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1993, 정답: 1480, 맞힌 사람: 1349, 정답 비율: 74.903%

### 분류

구현

### 문제 설명

<p>It&rsquo;s time for the annual 3-SAT competition, where the contestants compete to answer as many instances of 3-SAT as possible within the time limit. 3-SAT is a classic NP-complete problem, where you are given a boolean formula in <em>conjunctive normal form</em>, in which we have a set of <em>clauses</em> each consisting of exactly three <em>literals</em>. Each literal refer either positively or negatively to a <em>variable</em>, which can be assigned a value of either <code>True</code> or <code>False</code>. The question is whether there exists an assignment to the variables such that every clause evaluates to True. No clause will contain duplicates of a literal (however it is possible that a clause contain both &not;x<sub>i</sub> and x<sub>i</sub>). An example of a 3-SAT instance is shown below (from sample input 1):</p>

<p style="text-align: center;">(&not;x<sub>1</sub> &or; x<sub>2</sub> &or; x<sub>3</sub>) &and; (&not;x<sub>1</sub> &or; &not;x<sub>2</sub> &or; x<sub>3</sub>) &and; (x<sub>1</sub> &or; &not;x<sub>2</sub> &or; x<sub>3</sub>) &and; (x<sub>1</sub> &or; &not;x<sub>2</sub> &or; &not;x<sub>3</sub>) &and; (x<sub>1</sub> &or; x<sub>2</sub> &or; &not;x<sub>3</sub>)</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17903.%E2%80%85Counting%E2%80%85Clauses/b66c5b7b.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17903.%E2%80%85Counting%E2%80%85Clauses/b66c5b7b.png" data-original-src="https://upload.acmicpc.net/a3287a2c-330e-41f6-9284-9e278278511d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 136px; height: 114px; float: right;" />&Oslash;yvind is a judge in the competition, responsible for verifying the quality of problem instances crafted by the other judges before the contest starts. &Oslash;yvind hates 3-SAT instances with less than eight clauses &ndash; as these are always satisfiable they provide no real challenge for the contestants. Therefore, he will deem such problem instances to be unsatisfactory. Whenever &Oslash;yvind encounters an instance with eight or more clauses he knows that it is a real challenge to figure out whether this instance is satisfiable or not &ndash; and therefore he will judge these problem instances to be satisfactory. Given an instance of 3-SAT, can you help find &Oslash;yvind&rsquo;s judgement?</p>

### 입력

<p>The input is a single instance of the 3-SAT problem. The first line is two space-separated integers: m (1 &le; m &le; 20), the number of clauses and n (3 &le; n &le; 20), the number of variables. Then m clauses follow, one clause per line. Each clause consists of 3 distinct space-separated integers in the range [&minus;n, n] \ {0}. For each clause, the three values correspond to the three literals in the clause. If the literal is negative, that means that the clause is satisfied if the corresponding variable is set to <code>False</code>, and if it is positive the clause is satisfied if the variable is set to <code>True</code>.</p>

### 출력

<p>Print &ldquo;satisfactory&rdquo; on a single line if &Oslash;yvind finds the 3-SAT instance to be satisfactory, and &ldquo;unsatisfactory&rdquo; otherwise.</p>