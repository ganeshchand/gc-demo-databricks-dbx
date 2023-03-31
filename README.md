## Databricks DBX Demo
dbx is a CLI tool for development and advanced Databricks workflows management developed by Databricks Labs

This is a demo of the Databricks DBX for Scala SBT project using IntelliJ IDE.

Step 0: Create Standard Spark Scala SBT project

Step 1: Install DBX

Requirements:
* Python 3.8 or above
* pip
* dbx version 0.8.0 or above
```bash

conda activate dbx
pip install dbx --upgrade
dbx --version

# Note: Databricks CLI is automatically installed when you install DBX. 
databricks --version

# Configure Databricks CLI Profile within your .databrickscfg file
````

Step 2: Configure DBX for your project
Official documentation: https://docs.databricks.com/dev-tools/dbx.html#create-minimal-project-jar

```bash
# From the terminal, navigate to the root directory of your project.
conda activate dbx
dbx configure --profile <MY_PROFILE> --environment dev
# This will create a .dbx folder in your project directory with a project.json file

# create a folder named conf within your project root directory
mkdir conf
# Add deployment configuration. See sample `deployment.yaml` content at https://docs.databricks.com/dev-tools/dbx.html#configure-deployment-environments

```

Step 3: Deploy and run your job
    
```bash 
dbx deploy --environment dev --no-package
dbx launch --environment dev gc-demo-databricks-dbx-job
# it should provide you the the Job Run URL.
# For complete list of DBX commands, run `dbx --help`
```
See Databricks DBX documentation [here](https://docs.databricks.com/dev-tools/dbx.html#dbx-by-databricks-labs)
See DBX project documentation [here](https://dbx.readthedocs.io/en/latest/)