# [Gold III] Signal Strength - 4731

[문제 링크](https://www.acmicpc.net/problem/4731)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

그래프 이론, 최단 경로

### 문제 설명

<p>Net Profits Incorporated has announced a new generation of network switching devices aimed at supporting high-speed, instantly reconfigurable networks over long distances.</p>

<p>Their networks are based on a new kind of switching device that monitors several input lines, locking on to the strongest signal that it receives and passing that signal on to all output lines connected to its output ports.</p>

<p>The connecting lines are long enough that signal loss is a major concern.&nbsp;The switches themselves may cause additional signal loss. To counter both&nbsp;sources of loss, some switches are equipped with amplifiers. (To prevent destructive feedback, switches with amplifiers will not be connected in cycles such that their output can reach their own inputs, even indirectly.)</p>

<p>Develop a program to predict the effective signal strength that can be expected when a signal initiated at one point in a network is received at another point. You will be provided with a description of a network consisting of N switches (1 &le; N &le; 1000). For each switch, you will given a multiplier indicating how much weaker or stronger the output of the switch will be than the strength of the strongest input coming in to that switch. Switches without amplifiers will multiply the signal strength by a factor of no smaller than 0.1. Switches with amplifiers may multiply the signal strength by factors as high as 5.0.</p>

<p>You will also be provided with a description of the connecting lines within the network, including a multiplier indicating how much weaker a signal is at the end of the line than when it entered. These multipliers will be no smaller than 0.1 and no larger than 1.0.</p>

### 입력

<p>Input consists of one or more input sets.</p>

<p>Each input set describes one network. It begins with a line containing one integer, N, the number of switches in the network. These switches are identified by number starting at 0. The end of input is signaled by a non-positive value for N .</p>

<p>This is followed by N lines, each describing one switch and the lines attached to the output of that switch. This description begins with a floating point number giving the strength multiplier for that switch. This is followed by an integer k indicating how many lines are connected to the output of the switch. After that are k pairs of numbers, each describing one output line. The first number in each pair gives the number of the switch to which this output line connects (i.e., the switch receiving this line as an input). The second number is a floating point number giving the multiplier describing the signal loss on that line.</p>

### 출력

<p>For each network, print a line of the form</p>

<p>Network M: X</p>

<p>where M is the input set number (starting at 1) and where X is the signal strength expected at the output for switch N &minus; 1 if an input signal of strength 1.0 is presented at (all) inputs of switch 0. If that input never appears at the output of switch N &minus; 1, then X should be zero. X should be printed to two digits precision.</p>