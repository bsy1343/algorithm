# [Platinum I] Tourist Attractions - 8138

[문제 링크](https://www.acmicpc.net/problem/8138)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 251, 정답: 49, 맞힌 사람: 34, 정답 비율: 16.749%

### 분류

다이나믹 프로그래밍, 그래프 이론, 최단 경로, 비트마스킹, 데이크스트라, 외판원 순회 문제

### 문제 설명

<p>Byteasar travels from Bitingham to Byteburg. He wants to visit some must-see sites along the way, including some interesting monuments, fine restaurants, and numerous other tourist attractions. The order, which he visits the places in, is not entirely unimportant. For example, Byteasar would rather not climb the peaky tower of the Bitfork Castle right after a lavish dinner in Digitest, and, likewise, he would drop in to Zip City (called by some Sip City) for a cup of the famous Compresso coffee after dinner, rather than before. Luckily, his tour is, to some extent, flexible and he can choose between some orders. As a result of horrendous petrol prices, he&#39;d like to follow the shortest possible route, for economy&#39;s sake. Be a good friend and help him determine the length of the shortest path that meets his requirements.</p>

<p>The system of roads consists of n sites and m roads connecting them. The sites are numbered from 1 to n, and so are the roads (from 1 to m). Each road links a pair of different sites and is bidirectional. Different roads meet only at sites (which are their endpoints) and do not cross outside the sites, thanks to a clever system of flyovers and tunnels. Each road has a certain length. A pair of sites can be connected directly by at most one road, though there can be many paths consisting of at least two direct roads between them.</p>

<p>Let k denote the number of sites Byteasar wants to visit. Bitingham has number 1 in the numbering, Byteburg has number n, and the sites Byteasar wants to visit have numbers 2,3,&hellip;,k+1.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8138.%E2%80%85Tourist%E2%80%85Attractions/a67cfa83.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8138.%E2%80%85Tourist%E2%80%85Attractions/a67cfa83.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8138/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:279px; width:504px" /></p>

<p>An exemplary system of roads is shown in the figure. Suppose Byteasar wants to visit the sites 2, 3, 4 and 5, and he would like to visit 2 before 3, and 4 and 5 after 3. Then the shortest route leads through sites 1, 2, 4, 3, 4, 5, 8 and its length is 19.</p>

<p>Note that the site 4 appears on the route both before and after the site 3. It is perfectly OK and means that Byteasar will not stop there before visiting site 3, since his requirements disallow it. He is, however, allowed to pass through the site 4 without stopping before visiting the site 3 - and this is exactly what he is going to do!</p>

<p>Write a programme that:</p>

<ul>
	<li>reads from the standard input the description of the system of roads, the list of sites which Byteasar has chosen to visit and the restrictions regarding the order in which he wants to visit them,</li>
	<li>determines length of the shortest route leading in an appropriate order through all the chosen sites,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there are three integers n, m and k, separated by single spaces, 2 &le; n &le; 20,000, 1 &le; m &le; 200,000, 0 &le; k &le; 20; furthermore, inequality k &le; n-2 holds.</p>

<p>The following m lines contain the descriptions of the roads, exactly one in each line. The (i+1)&rsquo;th line contains three integers p<sub>i</sub>, q<sub>i</sub> and l<sub>i</sub>, separated by single spaces, 1 &le; p<sub>i</sub> &lt; q<sub>i</sub> &le; n, 1 &le; l<sub>i</sub> &le; 1,000.These numbers denote a road linking the sites p<sub>i</sub> and q<sub>i</sub> of length l<sub>i</sub>. You can safely assume that for each set of test data it is possible to get from Bitingham to Byteburg and each of the sites Byteasar wants to visit.</p>

<p>In the (m+1)&rsquo;th line there is one integer g, (0 &le; g &le;k&sdot;(k-1)/2}). It is the number of restrictions regarding the order in which Byteasar wants to visit the sites of his selection. These restrictions are given in the following g lines, one in each line. The (m+i+1)&rsquo;th line contains two integers r<sub>i</sub> and s<sub>i</sub> separated by a single space, 2 &le; r<sub>i</sub> &le; k+1, 2 &le; s<sub>i</sub> &le; k+1, r<sub>i</sub>&ne;s<sub>i</sub>. The pair r<sub>i</sub> and s<sub>i</sub> means that Byteasar wants to visit the site r<sub>i</sub> before visiting the site s<sub>i</sub>. It does not, however, prevent him from passing through s<sub>i</sub> before visiting r<sub>i</sub> nor passing through r<sub>i</sub> after having visited s<sub>i</sub>. He is free to do so, as long as he does not stop by and visit the tourist attractions. It is guaranteed that for each set of test data at least one order of visiting the selected sites while satisfying all the restrictions exists.</p>

### 출력

<p>In the first and only line of the standard output one integer should be written, i.e. the length of the shortest path from Bitingham to Byteburg passing in a proper order through all the sites Byteasar has selected.</p>