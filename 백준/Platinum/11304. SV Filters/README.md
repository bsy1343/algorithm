# [Platinum IV] SV Filters - 11304

[문제 링크](https://www.acmicpc.net/problem/11304)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 20, 정답: 4, 맞힌 사람: 3, 정답 비율: 20.000%

### 분류

그래프 이론, 그래프 탐색, 최대 유량

### 문제 설명

<p>NZPC Ltd (New Zealand Pump Control) designs and builds water filters. Their production system is fairly simple. A filter contains a sponge like material. We can think of it as having cavities and channels between the cavities through which water can flow. An NZPC customer requires filters which limit the amount of water flowing to be of particular specified values (SV filters). Each filter made by the company does have a particular maximum flow rate, determined by size, number and connection pattern of cavities and channels, however this rate is difficult to control during manufacture. NZPC come up with an ingenious method of making SV filters. Filters are manufactured by the normal method. If their flow rate is too low they are discarded. If the flow rate is too high, particles are added to the inlet of the filter. These particles block the flow through some channels (depending on size and connection pattern). The manufacturing process is to experiment with adding particles of different sizes in different sequences (flushing all particles out and starting again if flow becomes too low). Not all filters will be adjustable to the required flow rate, so some must still be discarded. Filters that are adjusted correctly are heat treated to lock the particles in place, and can be delivered to the customer.</p>

<p>In practice NZPC finds that their experimental process is not completely satisfactory. In particular, flushing particles after failure is difficult and time consuming, and the amount of water used is problematic (it seems that all the fresh water available is needed by Auckland (to cool their housing market (but that is another story))). To streamline their process NZPC installs a CT scanner (seems that a filter is much the same size and texture as a human brain). The scanner gives an accurate map of the cavities and channels in a filter. You are assigned the task of writing software to determine the effect of a particle addition to a filter.</p>

<p>To make the task more manageable you can make the following assumptions. All sizes and flow rates can be represented as integer values. Cavities are always large enough to allow the largest particle to pass through freely. Particles block a channel by getting stuck in the channel. This only happens when the particle is of the correct size for the channel. Large particles cannot pass through small channels, and do not block them. Small particles can pass freely through large channels. Particles whose size matches a channel block that channel, and do not pass through it. The map obtained from the CT scanner takes the form of a graph with cavities as nodes and channels as edges. One node is the inlet and one is the outlet. For each channel there is a single integer &lsquo;capacity&rsquo; value which is the maximum flow rate through that channel. Particles are of integer size also and by careful choice of units their sizes match the channel capacities, in the sense that a particle of size S exactly blocks a channel of capacity S. Note that flow can be in either direction through a channel.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11304.%E2%80%85SV%E2%80%85Filters/9b1f2794.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11304/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:263px; width:272px" />Consider the following example. The numbers on the cavities are for identification. In each graph the inlet is to cavity 0 and the outlet is from cavity 1. The numbers on each the edges show capacity and flow. In the left graph the total flow from inlet to outlet (maximal) is 7. For clarity in the diagram nodes are laid out so that most flows are from high to low. Note the negative flow in the edge between nodes 2 and 4 &ndash; in the diagram it is &lsquo;uphill&rsquo;. The right hand diagram shows the system after addition of size 5 particles. The edge between nodes 2 and 4 is now blocked (shown as dashed line) and total flow has dropped to 2.</p>

### 입력

<p>Input consists of a series of problems, each concerning one filter. The input for a problem starts with a line holding three integers N, E and P. N (3 &lt;= N &lt;= 1000) is the number of cavities and E (3 &lt;= E &lt;= 2000) is the number of channels of a filter. P (1 &lt;= P &lt;= 6) is the size of the particles that will be put into the filter. Following are E lines: one per channel, with three numbers on each: the indices of the two cavities connected by the channel, and the capacity C of the channel. Cavities are indexed from 0 to N-1. Cavity 0 is the inlet and cavity 1 is the outlet. Input is terminate by a line with three zeroes.</p>

### 출력

<p>For each problem output two numbers (integer values) separated by a space. The first number should be the maximum flow through the unmodified filter. The second should be the flow after particles of the given size have been added. Particle addition can be assumed to be complete &ndash; all reachable channels of the correct size will be blocked by the addition of particles.</p>