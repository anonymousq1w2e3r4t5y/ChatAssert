# ChatAssert

This repository contains the data and code for the paper "Feedback-directed LLM-based Oracle Generation". The data files are distributed according to the following research questions:

RQ1. How does ChatAssert compare against TECO? \
RQ2. How important is the use of iterative feedback in
ChatAssert? \
RQ3. What optional features of ChatAssert influence results
the most?

# Requirements

 - System requirements: Java 1.8 and Maven 3.8

# Setup

  - Create a Python 3.11.2 virtual environment with all
    dependencies. From inside the first `src/` directory, run the command: \
    `$> bash create_env.sh`
  - Create a file named `openai_api.key` file inside the `src/src` directory and paste your secret openai api key inside the file.
  - For every new terminal: from inside the first `src/` directory, run the following commands:
      - `$> export PYTHONPATH="$PWD/src"`
      - `$> source env/bin/activate`

# Execution

 - **Step 1**: Spawn the java gateway server:
    - Open a terminal inside the directory `src/astvisitors`
    - Run `$> bash s` and keep the terminal open
 - **Step 2:** Run the ChatAssert python module:
    - Open a terminal inside the directory `src/src/main`
    - Examples:
        - Run `$> python3 chatassert.py v1 <input_#.json>` # for running l-one
        - Run `$> python3 chatassert.py v2 <input_#.json>` # for running chatassert
