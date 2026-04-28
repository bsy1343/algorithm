# [Platinum I] Lost Permutation - 20243

[문제 링크](https://www.acmicpc.net/problem/20243)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 22, 맞힌 사람: 20, 정답 비율: 41.667%

### 분류

수학, 해 구성하기

### 문제 설명

<p>You once had a permutation $\pi$ of size $n$. And now it&#39;s gone. All you have left is an old device you made while studying group theory. To try and recover $\pi$ you can input a permutation $f$ of size $n$ into this device. This device will then display a permutation $\pi^{-1} \circ f \circ \pi$. Find $\pi$ using at most two interactions with the device.</p>

<p>A permutation of size $n$ is a sequence of $n$ distinct integers from $1$ to $n$. The <em>composition</em> of two permutations $a$ and $b$ is a permutation $a \circ b$ such that $(a \circ b)_i = b_{a_i}$. That is, if we consider a permutation as an action on $n$ elements, moving element at position $i$ to $a_i$, then $a \circ b$ is the action that applies $a$, then applies $b$, so that element at position $i$ first moves to $a_i$, then moves to $b_{a_i}$. Note that some definitions of composition use the reverse order.</p>

<p>The inverse permutation $\pi^{-1}$ is a permutation $\sigma$ such that $\sigma_{\pi_i} = i$. The composition of a permutation and its inverse is equal to an identity permutation: $(\pi \circ \pi^{-1})_i = &nbsp;(\pi^{-1} \circ \pi)_i = i$ for all $i$ from $1$ to $n$. For example, if $a = (4, 1, 3, 2)$ and $b = (3, 2, 1, 4)$, then $a \circ b = (4, 3, 1, 2)$, $a^{-1} = (2, 4, 3, 1)$ and $a^{-1} \circ b \circ a = (1, 2, 4, 3)$.</p>

### 입력



### 출력



### 힌트

<p>There are two test cases in the first test. In the first test case, $\pi = (4, 1, 3, 2)$ is the only permutation that satisfies $\pi^{-1} \circ (3, 2, 1, 4) \circ \pi = (1, 2, 4, 3)$ and $\pi^{-1} \circ (2, 4, 3, 1) \circ \pi = (2, 4, 3, 1)$. In the second test case, based on the interaction, $\pi$ can be equal to either $(1, 3, 2)$, $(2, 1, 3)$, or $(3, 2, 1)$. The solution got lucky and guessed the correct one: $(3, 2, 1)$.</p>