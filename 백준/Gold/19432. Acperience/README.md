# [Gold IV] Acperience - 19432

[문제 링크](https://www.acmicpc.net/problem/19432)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 85, 정답: 35, 맞힌 사람: 30, 정답 비율: 44.776%

### 분류

수학, 임의 정밀도 / 큰 수 연산, 미적분학

### 문제 설명

<p>Deep neural networks (DNN) have shown significant improvements in several application domains including computer vision and speech recognition. In computer vision, a particular type of DNN, known as Convolutional Neural Networks (CNN), have demonstrated state-of-the-art results in object recognition and detection.</p>

<p>Convolutional neural networks show reliable results on object recognition and detection that are useful in real world applications. Concurrent to the recent progress in recognition, interesting advancements have been happening in virtual reality (VR by Oculus), augmented reality (AR by HoloLens), and smart wearable devices. Putting these two pieces together, we argue that it is the right time to equip smart portable devices with the power of state-of-the-art recognition systems. However, CNN-based recognition systems need large amounts of memory and computational power. While they perform well on expensive, GPU-based machines, they are often unsuitable for smaller devices like cell phones and embedded electronics.</p>

<p>In order to simplify the networks, Professor Zhang tries to introduce simple, efficient, and accurate approximations to CNNs by binarizing the weights. Professor Zhang needs your help.</p>

<p>More specifically, you are given a weight vector $W = (w_1, w_2, \ldots, w_n)$. Professor Zhang would like to find a binary vector $B = (b_1, b_2, \ldots, b_n)$ ($b_i \in \{-1, +1\}$) and a real scaling factor $\alpha \ge 0$ in such a manner that $\left\|W - \alpha B\right\|^{2}$ will be minimum possible.</p>

<p>Note that $\left\|\cdot\right\|$ denotes the Euclidean norm, that is, $\left\|X\right\| = \sqrt{x_{1}^{2} + \cdots + x_{n}^{2}}$, where $X = (x_1, x_2, \ldots, x_n)$.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 100\,000$): the length of the given weight vector. The next line contains $n$ integers: $w_1, w_2, \ldots, w_n$ ($-10\,000 \le w_i \le 10\,000$).</p>

<p>There are no more than $400$ test cases. The total size of the input is at most $7$ mebibytes.</p>

### 출력

<p>For each test case, output the minimum value of $\left\|W - \alpha B\right\|^2$ as an irreducible fraction $p$<code>/</code>$q$ where $p$ and $q$ are integers, and $q &gt; 0$.</p>