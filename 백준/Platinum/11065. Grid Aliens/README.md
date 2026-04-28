# [Platinum I] Grid Aliens - 11065

[문제 링크](https://www.acmicpc.net/problem/11065)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 188, 정답: 48, 맞힌 사람: 31, 정답 비율: 20.261%

### 분류

최대 유량, 최대 유량 최소 컷 정리, 그래프 이론

### 문제 설명

<p>In a planet all aliens {a<sub>i</sub>} live on points of N&times;N grid space. Some aliens like to live with the water and others do not. This tendency is called hydrophilic property. So each alien a<sub>i</sub> has its own degree of hydrophilic property as a real number h<sub>i</sub> where 0 &le; h<sub>i</sub> &le; 1. An alien not living in boundary edges or corners has 4 neighbors (up, down, right, left) in grid. An alien living in edge (corner) points has 3(2) neighbors. Let the friendship of two adjacent neighbor aliens a<sub>i</sub> and a<sub>j</sub> be determined by the hydrophilic property h<sub>i</sub> and h<sub>j</sub> as the following:</p>

<p style="text-align:center">friend(a<sub>i</sub>,a<sub>j</sub>) = 1 - |h<sub>i</sub> - h<sub>j</sub>|</p>

<p>If two adjacent neighbour aliens have the same degree of hydrophilic property, then the friendship will be perfect such as friend(a<sub>i</sub>, a<sub>j</sub>) = 1. Critical situation, friend(a<sub>i</sub>, a<sub>j</sub>) = 0, may happen if h<sub>i</sub> = 0, h<sub>j</sub> = 1. Note that is not defined among non-adjacent alien pair such as (a,c) and (f,p) in Figure 1.&nbsp;</p>

<p>Those aliens decided to set up separating fences to reduce the conflicts between different hydrophilic aliens group. Thus they first need to allocate grid space to two disjoint regions; W region for hydrophilic aliens and Q region for hydrophobic aliens (who dislike the watery environment and have little values of hydrophilic property). So they will set up a closed fence for Q regions against W regions to separate conflicting aliens. In Figure 1, dotted cycles denote the separating fences for Q Aliens living on grid points {b,c,f,x,y} are classified as hydrophilic aliens. And {a,d,e,p,q} are aliens living in W region.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11065.%E2%80%85Grid%E2%80%85Aliens/810e858b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11065.%E2%80%85Grid%E2%80%85Aliens/810e858b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11065/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:280px; width:280px" /></p>

<p style="text-align:center">Figure 1. Three fences (dotted red) separate Q regions against R regions</p>

<p>There are so many ways to set up closed fences. When we build the separating fences, it is desirable to allocate the hydrophilic aliens to W region, and hydrophobic aliens to Q region. Also we should minimize the sum friend(a<sub>i</sub>, a<sub>j</sub>) for a<sub>i</sub> &isin; Q and a<sub>j</sub> &isin; W. Here x &isin; Q means that an alien x is assigned to Q region. All aliens are classified either Q or W exclusively.</p>

<p>So we give a formal objective function K for this (W, Q) separation problem as following:</p>

<p style="text-align:center">K = maximize{ CostW + CostQ - CostWQ }, where</p>

<p style="text-align:center">CostW = &Sigma;<sub>a<sub>i</sub>&isin;W</sub>h<sub>i</sub>, CostQ = &Sigma;<sub>a<sub>j</sub>&isin;Q</sub>(1-h<sub>j</sub>),<br />
CostWQ = &Sigma;<sub>a<sub>i</sub>&isin;W, a<sub>j</sub>&isin;Q</sub>friend(a<sub>i</sub>,a<sub>j</sub>), where (a<sub>i</sub>,a<sub>j</sub>) is a grid edge.</p>

<p>You should write a program to compute K given the hydrophilic properties of aliens on grid points.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case starts with a line containing an integer N (3 &le; N &le; 50) denoting the grid size. In the following N lines, the real numbers denoting the hydrophilic property h<sub>i,j</sub> of the alien living on a grid position (i,j) are given as N&times;N matrix where 0 &le; h<sub>i,j</sub> &le; 1. The floating point h<sub>i,j</sub> has exactly two digits after decimal point.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain a real number K with two digits after decimal point.&nbsp;</p>