# [Platinum IV] Cloud computing - 16026

[문제 링크](https://www.acmicpc.net/problem/16026)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 133, 정답: 76, 맞힌 사람: 64, 정답 비율: 54.701%

### 분류

다이나믹 프로그래밍, 배낭 문제, 정렬

### 문제 설명

<p>Johnny is founding Bytecomp, a company that offers computing power in the cloud. Companies with this profile usually have many fast computers on which customers&rsquo; computations can be made.</p>

<p>Johnny still has not bought any machines. He went to a computer shop and received a list of all n available computers. Every computer is specified by the number of (processor) cores c<sub>i</sub>, the clock rate f<sub>i</sub>, and the price v<sub>i</sub>. Such a computer contains ci separate cores that do not interfere with each other, so they can be assigned to different tasks.</p>

<p>When a customer makes an order for resources, she specifies the required number of cores C<sub>j</sub> and the minimum needed clock rate F<sub>j</sub>. An order also contains the price V<sub>j</sub> that the customer is willing to pay in return. If an order is accepted, Bytecomp needs to provide exclusive access to computing power required by the customer. Johnny needs to choose C<sub>j</sub> cores (possibly from different computers), each with clock rate at least F<sub>j</sub>. Those cores cannot be assigned to any other order.</p>

<p>Help Johnny earn as much as possible: choose an optimal subset of orders to accept and a subset of computers from the shop to satisfy all the accepted orders. Your goal is to maximize the total profit, that is, the difference between earnings for providing computing power to customers and the cost of buying the computers.</p>

### 입력

<p>The first line of the standard input contains an integer n (1 &le; n &le; 2000), the number of computers that are available at the shop. Each of next n lines contains a description of one computer. It consists of three space-separated integers c<sub>i</sub>, f<sub>i</sub>, and v<sub>i</sub> (1 &le; c<sub>i</sub> &le; 50, 1 &le; f<sub>i</sub> &le; 10<sup>9</sup>, 1 &le; v<sub>i</sub> &le; 10<sup>9</sup>) which represent the number of cores, the clock rate, and the price, respectively.</p>

<p>The next line contains an integer m (1 &le; m &le; 2000), the number of orders. Each of next m lines contains a description of one order. It consists of three space-separated integers C<sub>j</sub>, F<sub>j</sub>, and V<sub>j</sub> (1 &le; C<sub>j</sub> &le; 50, 1 &le; F<sub>j</sub> &le; 10<sup>9</sup>, 1 &le; V<sub>j</sub> &le; 10<sup>9</sup>) which represent the number of cores needed, the minimum allowed clock rate, and the customer&rsquo;s budget, respectively.</p>

### 출력

<p>The only line of the standard output should contain one integer, the maximum total profit that can be achieved.</p>