# [Platinum V] Bread Pit - 23786

[문제 링크](https://www.acmicpc.net/problem/23786)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 8, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 수학, 정수론, 트리

### 문제 설명

<p>New breeds of underground bacteria help in terraforming Mars. The bacteria feed mainly on regular bread loafs which are baked in huge quantities on the Mars surface and subsequently dropped into a specially constructed pit. To distribute the bread evenly in the subsurface, the pit consists of nearly vertical tunnels arranged in a tree-like structure. Each tunnel ends either in a cave filled with bacterial colonies or in a gate which connects into one or more other downward tunnels. The gates are mechanized and each of them keeps open only one downward tunnel at a time. When a loaf falls through a gate into a downward tunnel, the gate closes the tunnel and opens another one, to which it is connected, for the next arriving loaf. Opening the downward tunnels works in a cyclic fashion: When a gate closes the last downward tunnel it again opens the one which was open first. The order of open downward tunnels in each gate is fixed. At most one of the gates is on the surface. All loafs falling through at least one tunnel also fall through this topmost gate. The exception to the described scheme is the situation when the topmost gate is completely closed for maintenace, all tunnels become inaccessible and the loafs remain at the surface. In this scenario, for formal reasons, the surface is considered to be a cave and simutaneously the only node in the whole pit.</p>

<p>When the system started operating, before any bread loaf was deposited in it, the first downward tunnel in each gate was open.</p>

<p>Both caves and gates are commonly denoted as nodes, each node is labeled by a unique integer.</p>

<p>Determine which cave did each bread loaf fall into, as they were subsequently dropped, one after another, into the pit.</p>

### 입력

<p>The first input line contains two integers N, Q (1 &le; N, Q &le; 3 &middot; 10<sup>5</sup>), the number of all nodes (gates and caves) in the pit and the number of bread loafs dropped into the pit. The nodes are labeled by integers 0, 1, . . . , N &minus; 1, the surface gate node is labeled by 0. The second line contains N &minus; 1 integers. The value of i-th integer on the line is the label of the predecessor of node i. The predecessor of a node is the closest gate from which a falling loaf arrives to node i. The second input line also encodes the order of open downward tunnels in each gate. When value X appears on j-th and k-th positions and j &lt; k, the tunnel connecting X to j opens before the tunnel connecting X to k opens.</p>

### 출력

<p>Print Q lines. The i-th line should contain the label of the cave that received the i-th loaf dropped into the pit.</p>