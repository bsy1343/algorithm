# [Platinum V] Irreversible Reactions - 22377

[문제 링크](https://www.acmicpc.net/problem/22377)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

수학, 선형대수학, 가우스 소거법

### 문제 설명

<p>Life is ephemeral. What is done sometimes cannot be irreversible. In terms of this, chemical reaction networks are similar to life.</p>

<p>For brevity, we model a chemical reaction network as follows. There are $N$ states in a chemical reaction network. The reaction starts with the state $S$. $M$ distinct pairs ($u_i$, $v_i$) of states have a relation such that $u_i$ can be transited to $v_i$. For each unit of time, a state is transited to other states if there is at least one state that can be transited from the state. If there are no such states, the state does not change. If there are two or more states to which the current state can be transited, the next state is selected at uniformly random from these states.</p>

<p>In an experiment of the chemical reaction network, we stop the experiment when the current state does not change. In addition, after transitions, it might reach a state from which it&#39;s impossible to return back to $S$ by repeating transitions. In such cases we also stop the experiment. Your task as a bioinformatics researcher is to write a program to compute the expected time until we stop the experiment. If the expected time is infinite, output $-1$&nbsp;instead.</p>

<p>A more precise description of the experiment termination criteria is the following. If there are no states that can be transited from the current state, we stop the experiment immediately. Otherwise, the experiment does not stop, if it is possible to return back to $S$ from the current state by repeating zero or more transitions. In other words, the state $S$ itself is always considered as a state that can return to $S$ in this case.</p>

### 입력

<p>The input consists of a single test case in the format below.</p>

<blockquote>
<p>$N$ $M$ $S$</p>

<p>$u_1$ $v_1$</p>

<p>$\vdots$</p>

<p>$u_M$ $v_M$</p>
</blockquote>

<p>The first line contains three integers $N$ ($2 \le N \le 200$), $M$ ($1 \le M \le \min{(N(N-1)1000)}$), $S$ ($1 \le S \le N$). $N$ is the number of states in a chemical reaction network. $M$ is the number of transitions between states. $S$ is the initial state. The $i$-th of the following $M$ lines represents the $i$-th transition, which means a state $u_i$ can be transited to $v_i$ ($1 \le u_i, v_i \le N$, $u_i \ne v_i$). Note that it does not necessarily imply $v_i$ can be transitioned to $u_i$. It is guaranteed that the pairs $u_i$ and $v_i$ are distinct. That is, for $1 \le i &lt; j \le M$, either $u_i \ne u_j$ or $v_i \ne v_j$ holds.</p>

### 출력

<p>Output the expected time to reach one of the states from which it&#39;s impossible to return back to the initial state $S$. The expected time can be huge, thus outputs the expected time modulo $10^9 + 7$. More precisely, if it is finite, the expected time can be represented as an irreducible fraction $b/a$, and you should output the minimum non-negative integer $x$ which satisfies $ax \equiv b \bmod {10^9 + 7}$. You may assume that such $x$ exists for the given input.</p>

<p>If the expected time is infinity, output $-1$ instead.</p>